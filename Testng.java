package Youtube;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng {

	@BeforeTest
	public void launchbrowser()
	{
		System.out.println("Launch Chrome Browser");
	}
	
	@Test(priority=1,description="Run First Batch")
	public void batch()
	{
		System.out.println("Login Website");
	}
	@Test(priority=2,description="Run Rest Test")
	public void all()
	{
		System.out.println("Logout Website");
	}
	@AfterTest
	public void closehbrowser()
	{
		System.out.println("Close Chrome Browser");
	}
	@BeforeMethod
	public void Beforestart()
	{
		System.out.println("Before Start all @Test");
	}
	@AfterMethod
	public void AfterFinish()
	{
		System.out.println("After Finish all @Test");
	}
	

}
