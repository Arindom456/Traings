package Youtube;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\\\java\\\\Test1\\\\WebDriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Implicit wait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();

		WebElement Motor =  driver.findElement(By.linkText("Motors"));
		
		Actions mouse = new Actions(driver);
		mouse.moveToElement(Motor).perform();
		
		//Explicit wait//
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Auto and truck parts"))).click();
				
		//driver.findElement(By.linkText("Auto and truck parts")).click();
		
	}

}
