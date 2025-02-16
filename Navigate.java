package Accenture.Test1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\java\\Test1\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Maximize window
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		//Navigate to another websites
		driver.navigate().to("https://www.instagram.com/");
		//Navigate Back 
		driver.navigate().back();
		//Navigate forward
		driver.navigate().forward();
		//Refresh website
		driver.navigate().refresh();
		//Close 
		driver.close();

	}

}
