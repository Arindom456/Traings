package Youtube;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\java\\Test1\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement Drop = driver.findElement(By.id("input_1_8"));
		Select select = new Select(Drop);
		select.selectByValue("level5");
		
		WebElement Drop1 = driver.findElement(By.id("input_1_75"));
		Select select1 = new Select(Drop1);
		select1.selectByVisibleText("Chemicals");

		
	}

}
