package Youtube;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\java\\Test1\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		String URLName = driver.getCurrentUrl();
		System.out.println(URLName);
		
		String Title = driver.getTitle();
		System.out.println(Title);
		
		String Page = driver.getPageSource();
		System.out.println(Page);
		
		/*
		driver.navigate().to("https://the-internet.herokuapp.com/dynamic_loading");
		driver.close();
		*/
		
		WebElement UName = driver.findElement(By.id("user-name"));
		UName.sendKeys("visual_user");
		
		WebElement Pass = driver.findElement(By.id("password"));
		Pass.sendKeys("secret_sauce");
		
		WebElement Btn = driver.findElement(By.id("login-button"));
		Btn.click();
		
		List<WebElement> Product =driver.findElements(By.xpath("//div[@class = 'inventory_list']/div"));
		System.out.println("Total Size is "+Product.size());
		
		String Fwindow = driver.getWindowHandle();
		System.out.println(Fwindow);
		
		driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).click();
		Set<String> Swindow = driver.getWindowHandles();
		System.out.println(Swindow);
		
		driver.close();
	}

}
