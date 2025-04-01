package Youtube;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNGSkip {
	boolean val = true;
	
@Test(enabled=false,description="SKIP using enabled")
	public void Skiptestenabled()
	{
		System.out.println("SKIP using Enable False");
	}
@Test(description="Skip Due to exception")
	public void Skiptestexception()
	{
		System.out.println("SKIP using exception");
		throw new SkipException("Not execute because exception");
	}
@Test(description="Skip based pn condition")	
	public void ConditionSkip()
	{
		if(val==false)
		{
		System.out.println("Ready to Execute");
		}
		else
		{
			System.out.println("Skip based on condition");
			throw new SkipException("Skip based on condition");
		}
	}
}
