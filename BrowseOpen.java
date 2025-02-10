package Accenture.Test1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class BrowseOpen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\java\\Test1\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/text-box.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Click and Enter First Name//
		WebElement First = driver.findElement(By.id("fullname"));
		First.click();
		First.sendKeys("Bubun");
		
		
		//Click and Enter Email//
		WebElement Email = driver.findElement(By.id("email"));
		Email.click();
		Email.sendKeys("arindom@gmail.com");
		
		//Click and Enter Address//
		WebElement Address = driver.findElement(By.id("address"));
		Address.click();
		Address.sendKeys("72, Soudamini Nagar Rishra");
		
		//Click and Enter Password//
		WebElement Password = driver.findElement(By.id("password"));
		Password.click();
		Password.sendKeys("98arindom");
				
		// Click Submit button//
		WebElement Submit = driver.findElement(By.xpath("//*[@id=\"TextForm\"]/div[5]/input"));
		Submit.click();
		
		
		// CheckBox//
		// Click Open Home Menu//
		WebElement Home = driver.findElement(By.xpath("/html/body/main/div/div/div[1]/div/div[1]/h2/button"));
		Home.click();
		
		// Click check box//
		WebElement CheckboxMenu = driver.findElement(By.linkText("Check Box"));
		CheckboxMenu.click();
		
		//Select Main Level1 //
		WebElement mainLevel1 = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div/ul/li[1]/span[1]"));
		mainLevel1.click();
		
		// click Sub Level 2//
		WebElement SubLevel2 = driver.findElement(By.id("c_bf_2"));
		SubLevel2.click();
		
		//Select Main Level2 //
		WebElement mainLevel2 = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div/ul/li[2]/span[1]"));
		mainLevel2.click();
				
		// click Sub Level 2//
		WebElement SubLevel3 = driver.findElement(By.id("c_bf_3"));
		SubLevel3.click();
		
		//Radio Button//
		WebElement Radio = driver.findElement(By.linkText("Radio Button"));
		Radio.click();
		
		//Total button count//
		
		List<WebElement> total = driver.findElements(By.xpath("//input[@type='radio']"));
		
		int totalcount = total.size();
		
		System.out.println("Count the radio buttons: "+totalcount);
		
		//click radio button//
		
		WebElement	impressive= driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[3]/input"));
		impressive.click();
		
		// check the Button is clicked or not//
		
		boolean Checkradio = impressive.isSelected();
		System.out.println("Radio is "+ Checkradio);
		
		
		//Window Close
	//driver.close();
			
	}

}
