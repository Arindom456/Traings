package Udemy;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assesment1 {

	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver","D:\\java\\Test1\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[4]/div/label[2]/span[1]")).click();
		//Wait 5 sec to load popup window//
		WebDriverWait wa = new WebDriverWait(driver, Duration.ofSeconds(9));
		wa.until(ExpectedConditions.elementToBeClickable(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		WebElement drop = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[5]/select"));
		Select select = new Select(drop);
		select.selectByIndex(2);
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		wa.until(ExpectedConditions.elementToBeClickable(By.className("navbar-brand")));
		
		
	}

}
