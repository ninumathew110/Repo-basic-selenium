package TestngBasics;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest6 {
	@Test
	public void parent()
	{
		Reporter.log("parent method", true);			
	}
	
	@Test(dependsOnMethods  = "parent")
	public void elderchild()
	{
		Reporter.log("elderchild method", true);			
	}
	
	@Test(enabled=false)//disabling the testMethod only for execution part
	public void youngerchild()
	{
		Reporter.log("younger method", true);		
	}

}
