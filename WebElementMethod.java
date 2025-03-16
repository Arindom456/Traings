package Youtube;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebElementMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\java\\Test1\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
		
		WebElement Business = driver.findElement(By.id("input_1_1"));
		Business.sendKeys("arindom@gmail.com");
		
		WebElement Fname = driver.findElement(By.id("input_1_3_3"));
		Fname.sendKeys("Arindom");
		Thread.sleep(3000);
		driver.findElement(By.id("input_1_3_3")).clear();
		
		String Att = driver.findElement(By.id("input_1_1")).getAttribute("placeholder");
		System.out.println(Att);
		
		System.out.println(driver.findElement(By.id("gform_submit_button_1")).getSize());
		
		System.out.println(driver.findElement(By.id("gform_submit_button_1")).getCssValue("color"));
		
		System.out.println(driver.findElement(By.id("gform_submit_button_1")).getAttribute("class"));
		
		System.out.println(driver.findElement(By.id("gform_submit_button_1")).isDisplayed());
		System.out.println(driver.findElement(By.id("gform_submit_button_1")).isEnabled());
		System.out.println(driver.findElement(By.id("gform_submit_button_1")).isSelected());
	}

}
