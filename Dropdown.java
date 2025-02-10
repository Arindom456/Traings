package Accenture.Test1;

import java.time.Duration;
import java.util.List;

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
		driver.get("https://www.tutorialspoint.com/selenium/practice/select-menu.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		// Select one option
		WebElement alldrop = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div[2]/select"));
		Select drop = new Select(alldrop);
		
		
		
		List<WebElement> d = drop.getOptions();
	      for (WebElement d1 : d){
	         System.out.println("Options are: " + d1.getText());
	      }
		
		
		
		// Select First Option// 
		/*
		WebElement o = drop.getFirstSelectedOption();
	      System.out.println("Option selected by default: " + o.getText());
	      
	      WebElement d = drop.selectByValue("1");
	     System.out.println("Select Value of 1 position" +d); 
		*/
	}

}
