package TestngBasics;

import org.testng.Reporter;
import org.testng.annotations.Test;


public class DemoTest3 {
	@Test
	public void demoTest1()
	{
		//print statement in the testNG
		Reporter.log("Executed DemoTest 1 method---->Pass", true);
		Reporter.log("Executed DemoTest 2 method---->Pass", true);
		Reporter.log("Executed DemoTest 3 method---->Pass", true);
		Reporter.log("Executed DemoTest 4 method---->Pass", true);
		Reporter.log("Executed DemoTest 5 method---->Pass", true);
		Reporter.log("Executed DemoTest 6 method---->Pass", true);
		Reporter.log("Executed DemoTest 7 method---->Pass", true);
	}
}