package Youtube;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddCart {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","D:\\java\\Test1\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		
		List<WebElement> items = driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i =0;i<items.size();i++)
		{
			String item = items.get(i).getText();
			
		if(item.contains("Carrot"))
			{
				driver.findElements(By.xpath("//button[text() ='ADD TO CART']")).get(i).click();
				break;
			}
		}
	}

}
