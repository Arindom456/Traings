package Youtube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Multiselect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\java\\Test1\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/select-menu.php");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id=\"mbsc-control-0\"]/div/label/span[2]/span[1]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div[43]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div[46]")).click();
		/*WebElement Drop = driver.findElement(By.xpath("//*[@id='demo-multiple-select']"));
		Select select = new Select(Drop);
		select.selectByIndex(5);

	      // select item by visible text
	      select.selectByVisibleText("Books");
	      */
		//select.selectByVisibleText("Home, Garden & Tools");
		//select.selectByVisibleText("Clothing & Jewelry");
		
	}

}
//*[@id="demo-multiple-select"]