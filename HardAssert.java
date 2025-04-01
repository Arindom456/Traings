package Youtube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HardAssert {
@Test
	public void AssertExample()
	{
		System.setProperty("webdriver.chrome.driver","D:\\java\\Test1\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		String ExpectedTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		String Searchval = "Search";
		String ActualTitle = driver.getTitle();
		//HardAssert//
		Assert.assertEquals(ExpectedTitle, ActualTitle, "Title varification fail");
		String Actualsearch = driver.findElement(By.id("gh-search-btn")).getDomAttribute("value");
		Assert.assertEquals(Searchval, Actualsearch);
		
		driver.close();
		
	}

}
