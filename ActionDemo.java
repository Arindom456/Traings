package Udemy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\\\java\\\\Test1\\\\WebDriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/a"))).build().perform();
		WebElement Search = driver.findElement(By.id("small-searchterms"));
		Search.click();
		action.keyDown(Keys.SHIFT).sendKeys("phone").build().perform();
		action.contextClick(driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[4]/a"))).build().perform();

	}

}
