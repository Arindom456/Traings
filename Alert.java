package Youtube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\java\\Test1\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
		driver.manage().window().maximize();
		
		WebElement AlartBtn = driver.findElement(By.xpath("//button[text() ='Alert']"));
		AlartBtn.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		WebElement AlartBtn1 = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div[2]/button"));
		AlartBtn1.click();
		Thread.sleep(9000);
		driver.switchTo().alert().accept();
		
		WebElement AlartBtn2 = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div[3]/button"));
		AlartBtn2.click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		
		//driver.quit();
		
		
	}

}
