package TestNgAssertion;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Asssertion_HardAssert2 {

	@Test
	public void DemoTest()
	{
		String expcondition1 ="Harry";
		String actualcondition1="harry";
		
		int expcondition2 =0;
		int actualcondition2 =0;
		
		boolean expcondition3 =true;
		boolean actualcondition3 =true;
		
		//validate using ASSERTION
		//condition should match
		Assert.assertEquals(expcondition1, actualcondition1);
		
		//condition should not match
		Assert.assertNotEquals(expcondition2, actualcondition2);
		
		//explicitly make testFail
		Assert.fail();
		Reporter.log("Demo test executed",true);
		
	}
}
