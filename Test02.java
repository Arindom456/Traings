package Udemy;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test02 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\\\java\\\\Test1\\\\WebDriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		WebElement Staticdd = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(Staticdd);
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		driver.findElement(By.id("divpaxinfo")).click();
		int i =1;
		while(i<6)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			Thread.sleep(2000);
			i++;
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
	
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	
		//Click From and enter location//
	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
	driver.findElement(By.xpath("//a[@value='CCU']")).click();
	Thread.sleep(3000);
	
	//Click To and enter location//
	driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();
	
	//Auto Sugession//
	driver.findElement(By.id("autosuggest")).sendKeys("ind");
	List<WebElement> Citylist = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
	for(WebElement option : Citylist)
	{
		if(option.getText().equalsIgnoreCase("india"))
		{
			Thread.sleep(3000);
			option.click();
			break;
		}
	}
	
	}
	
}
