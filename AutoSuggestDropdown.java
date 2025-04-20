package Youtube;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\java\\Test1\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		//Close pop up//
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class ='commonModal__close']")).click();
		
		driver.findElement(By.xpath("//span[text() = 'From']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder ='From']")).sendKeys("Kolkata");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder ='From']")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder ='From']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text() = 'To']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder ='To']")).sendKeys("Delhi");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder ='To']")).sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder ='To']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		driver.close();
	}

}
