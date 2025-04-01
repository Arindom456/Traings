package Youtube;


import org.testng.annotations.Test;
//All class in one group//
@Test(groups="HR133")
public class TestngGroup {
	
	@Test(priority=1,description="Run First Testcase",groups="E2E")
	public void TC01()
	{
		System.out.println("TC01 Executed");
	}
	@Test(priority=2,description="Run Second Testcase",groups="E2E")
	public void TC02()
	{
		System.out.println("TC02 Executed");
	}
	//multiple group//
	@Test(priority=3,description="Run Third Testcase",groups={"Unit","E2E"})
	public void TC03()
	{
		System.out.println("TC03 Executed");
	}
	@Test(priority=4,description="Run Fourth Testcase",groups="Unit")
	public void TC04()
	{
		System.out.println("TC04 Executed");
	}
	@Test(priority=5,description="Run Fifth Testcase",groups="Regrassion")
	public void TC05()
	{
		System.out.println("TC05 Executed");
	}

}
