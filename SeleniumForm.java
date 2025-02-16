package Accenture.Test1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\java\\Test1\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoqa.com/");
		//Open Elements
		WebElement Element = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[3]/h5"));
		Element.click();
		WebElement Textbox = driver.findElement(By.xpath("//*[@id=\"item-0\"]/span"));
		Textbox.click();
		
		//Enter First Name//
		WebElement FirstName = driver.findElement(By.id("userName"));
		FirstName.click();
		FirstName.sendKeys("Arindom Dutta");
		
		WebElement Email = driver.findElement(By.id("userEmail"));
		Email.click();
		Email.sendKeys("arindom@gmail.com");
	}

}
