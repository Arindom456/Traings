package Youtube;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplewindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\java\\Test1\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Start free trial")).click();
		
		Set<String> Windowhandel = driver.getWindowHandles();
		System.out.println(Windowhandel);
		
		Iterator<String> iterator = Windowhandel.iterator();
		String Parentwin = iterator.next();
		String Childwin = iterator.next();
		
		driver.switchTo().window(Childwin);
		
		driver.findElement(By.name("UserFirstName")).sendKeys("Arindom");
		driver.findElement(By.name("UserLastName")).sendKeys("Dutta");

	}

}
