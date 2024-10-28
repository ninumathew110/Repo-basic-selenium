package TestNgAssertion;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Asssertion_HardAssert {//using if condition

	@Test
	public void DemoTest()
	{
		String expcondition ="Harry";
		String actualcondition="harry";
		
		if(expcondition.equals(actualcondition)) 
		{
			Reporter.log("Demo test passed",true);
		}
		else
		{
			Reporter.log("Demo test failed",true);
		}
		Reporter.log("Demo test completed",true);
	}
}
