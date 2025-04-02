package Youtube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DatadrivenWebsite {

@Test(dataProvider="inputdata1")
public void web(String Username, String Password) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","D:\\java\\Test1\\WebDriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	driver.findElement(By.id("user-name")).sendKeys(Username);
	driver.findElement(By.id("password")).sendKeys(Password);
	driver.findElement(By.id("login-button")).click();
	Thread.sleep(3000);
	driver.quit();
	}
	
	
@DataProvider
	public Object[][] inputdata1()
	{
		return new Object[][]  {
			{"standard_user","secret_sauce"},
			{"locked_out_user","secret_sauce"},
			{"problem_user","secret_sauce"}
			};			
		}		
	}

