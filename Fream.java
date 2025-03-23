package Youtube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fream {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\java\\Test1\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vinothqaacademy.com/iframe/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		Thread.sleep(3000);
		driver.findElement(By.id("nameInput")).sendKeys("Arindom");
		//driver.switchTo().frame(1);
		WebElement ife = driver.findElement(By.name("registeruser"));
		driver.switchTo().frame(ife);
		driver.findElement(By.id("vfb-5")).sendKeys("Arindom");
		
		//driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div[1]/div/section[3]/div/div[1]/div/div/div/center/button")).click();
		Thread.sleep(3000);

	}

}
