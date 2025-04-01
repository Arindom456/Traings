package Youtube;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
@Test(dataProvider ="userdata")
	public void login(String User, String Password)
	{
		System.out.println(User+"==="+Password);
	}
//Old Type//	
@DataProvider
public Object[][] userdata()
{
	Object[][] dataset = new Object[4][2];
	dataset[0][0]="User1";
	dataset[0][1]="Pass1";
	
	dataset[1][0]="User2";
	dataset[1][1]="Pass1";
	
	dataset[2][0]="User3";
	dataset[2][1]="Pass3";
	
	dataset[3][0]="User4";
	dataset[3][1]="Pass4";
	
	return dataset;
}
//New way//
	@Test(dataProvider ="user2")
	public void log(String User1, String Password1)
	{
		System.out.println(User1+"==="+Password1);
	}	
	@DataProvider
	public Object[][] user2()
	{
		return new Object[][] {
			{"Arindom","12345"},{"Bubun","23654"},{"Ashoke","899654"}
			};
	}
}


