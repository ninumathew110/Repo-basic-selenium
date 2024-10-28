package TestngBasics;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest5 {

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
	@Test(dependsOnMethods  = "parent")
	public void youngerchild()
	{
		Reporter.log("younger method", true);		
	}
}
