package Youtube;

import java.io.File;
import java.util.Date;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeSS {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","D:\\java\\Test1\\WebDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		Date Currentdate = new Date();
		//System.out.println(Currentdate);
		String Date1 = Currentdate.toString().replace(" ", "_").replace(":", "-");
		//System.out.println(Date1);
		
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File(".//screenshot/"+Date1+".png"));
		driver.quit();
		 //String screenshotBase64 = ((TakesScreenshot) element).getScreenshotAs(OutputType.BASE64);


	}

}
