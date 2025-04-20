package Youtube;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddCartPart2 {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","D:\\java\\Test1\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String[] vagitable = {"Cucumber","Tomato","Potato","Apple","Grapes"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//[2]
		addcart(driver,vagitable);
		/*
		 [1]
		AddCartPart2 addcart = new AddCartPart2();
		addcart.addcart(driver, vagitable);
		*/
		
	}

	
	
	//If you remove static then you can declare object of class [1] //
	//public void addcart(WebDriver driver,String[] vagitable)
	
	
	//If you add static then you don't need to declare object [2]//
	public static void addcart(WebDriver driver,String[] vagitable)
	{
	List<WebElement> items = driver.findElements(By.cssSelector("h4.product-name"));
	int j =0;
	for(int i =0;i<items.size();i++)
	{
		String[] item = items.get(i).getText().split("-");
		String finalname = item[0].trim();
		//Convert Array into ArrayList//
		List<String> needvegies = Arrays.asList(vagitable);
					
		if(needvegies.contains(finalname))
		{
			j++;
			driver.findElements(By.xpath("//div[@class=\"product-action\"]/button")).get(i).click();
			if(j==vagitable.length)
			{
			break;	
			}
		}			
	}
	driver.findElement(By.cssSelector("img[alt='Cart']")).click();
	driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
	driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
	driver.findElement(By.cssSelector("button.promoBtn")).click();
	//explicit wait
	WebDriverWait wa = new WebDriverWait(driver,Duration.ofSeconds(10));
	wa.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
	System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
}
}
