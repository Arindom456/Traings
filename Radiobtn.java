package Youtube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobtn {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\java\\Test1\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		//Close pop up//
		driver.findElement(By.xpath("//span[@class ='commonModal__close']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text() = 'Student']")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
