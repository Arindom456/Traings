package Youtube;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alllink {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\java\\Test1\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll")).click();
		
		List<WebElement> All = driver.findElements(By.tagName("a"));
		System.out.println("Total Links are: "+All.size());
		
		for(int i = 0; i<All.size(); i++)
		{
			System.out.println("Link: "+All.get(i).getAttribute("href"));
			System.out.println("Text: "+All.get(i).getText());
		}
		
		driver.close();
	}

}
