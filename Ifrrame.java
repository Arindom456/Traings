package Udemy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ifrrame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\\\java\\\\Test1\\\\WebDriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		WebElement Dragpoint = driver.findElement(By.id("draggable"));
		WebElement Droppoint = driver.findElement(By.id("droppable"));
		
		Actions dragdrop = new Actions(driver);
		dragdrop.dragAndDrop(Dragpoint, Droppoint).build().perform();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/ul/li[2]/a")).click();
		
		
	}

}
