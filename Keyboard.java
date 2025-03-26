package Youtube;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","D:\\java\\Test1\\WebDriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://extendsclass.com/text-compare.html");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			WebElement Copy = driver.findElement(By.xpath("//*[@id=\"dropZone\"]/div[2]"));
			
			Actions action = new Actions(driver);
			action.keyDown(Copy, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
			Thread.sleep(3000);
			
			WebElement Paste = driver.findElement(By.xpath("//*[@id=\"dropZone2\"]/div[2]"));
			action.keyDown(Paste, Keys.CONTROL).sendKeys("a").build().perform();
			Thread.sleep(3000);
			action.keyDown(Paste, Keys.BACK_SPACE).perform();
			Thread.sleep(3000);
			action.keyDown(Paste, Keys.CONTROL).sendKeys("v").perform();
			Thread.sleep(3000);
			driver.quit();

	}

}
