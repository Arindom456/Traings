package Youtube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAss {
@Test
	public void AssertExample()
	{
		System.setProperty("webdriver.chrome.driver","D:\\java\\Test1\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		//SoftAssert//
		SoftAssert softassert = new SoftAssert();
		String ExpectedTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
		String Searchval = "Search";
		String ActualTitle = driver.getTitle();
		String Actualsearch = driver.findElement(By.id("gh-search-btn")).getDomAttribute("value");
		softassert.assertEquals(ExpectedTitle, ActualTitle, "Title varification fail");
		softassert.assertEquals(Searchval, Actualsearch);
		driver.close();
		softassert.assertAll();
		
	}

}
