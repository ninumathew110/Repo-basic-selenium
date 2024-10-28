package TestNgDataProvider;

import org.testng.annotations.DataProvider;

public class BaseClass {

	@DataProvider
	public Object[][] RegisterData() 
	{
		
		Object[][] data = new Object[3][3];//3x3
		
		data [0][0]="Tanmoy";
		data [0][1]=101;
		data [0][2]="Testing";
		
		data [1][0]="Ninu Mathew";
		data [1][1]=102;
		data [1][2]="Testing";
		
		data [2][0]="Deepika";
		data [2][1]=103;
		data [2][2]="Developer";
		
		return data;
	}
}
