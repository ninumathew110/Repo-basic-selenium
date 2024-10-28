package TestngBasics;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTesting {

	@Test
	public void demoTest1()
	{
		//print statement in the testNG
		Reporter.log("Executed DemoTest 1 method---->Pass", true);//its like system.out.println in java
	
		//print statement in the testNG
		Reporter.log("Executed DemoTest 2 method---->Pass", true);
		
		//print statement in the testNG
		Reporter.log("Executed DemoTest 3 method---->Pass", true);
	}
	@Test
	public void demoTest2()
	{
		//print statement in the testNG
		Reporter.log("Executed DemoTest 2 method---->Pass", true);
	}
	@Test
	
	public void demoTest3()
	{
		//print statement in the testNG
		Reporter.log("Executed DemoTest 3 method---->Pass", true);
	}
}
