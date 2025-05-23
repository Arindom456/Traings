package Udemy;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandel {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\\\java\\\\Test1\\\\WebDriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> window = windows.iterator();
		String Parent1 = window.next();
		String Child1 = window.next();
		driver.switchTo().window(Child1);
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0]);
		String Username = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		driver.switchTo().window(Parent1);
		driver.findElement(By.id("username")).sendKeys(Username);
	}

}
