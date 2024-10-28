package TestngBasics;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest7 {
	//execute the test method multiple times
	@Test(invocationCount = 10)
	public void parent()
	{
		Reporter.log("parent method", true);			
	}
}
