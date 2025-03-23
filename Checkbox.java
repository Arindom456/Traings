package Youtube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\java\\Test1\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
		
		WebElement Btn = driver.findElement(By.id("gform_submit_button_1"));
		Actions actions = new Actions(driver);
		actions.moveToElement(Btn);
		actions.perform();
		
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"input_1_12_1\"]")).click();
		Thread.sleep(3000);
		driver.close();
		
	}

}
