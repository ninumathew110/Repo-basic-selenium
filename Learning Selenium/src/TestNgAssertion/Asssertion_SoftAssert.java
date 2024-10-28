package TestNgAssertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Asssertion_SoftAssert {

	@Test
	public void DemoTest()
	{
		String expcondition1 ="Harry";
		String actualcondition1="harry";
		
		int expcondition2 =0;
		int actualcondition2 =0;
		
		boolean expcondition3 =true;
		boolean actualcondition3 =false;
	
		//create an object for soft asser and call the methods to assert
		SoftAssert softassert = new SoftAssert();
		
		//condition  should satisfy
		softassert.assertEquals(actualcondition3, actualcondition3);
		
		//mandatory method
		softassert.assertAll();
		
	}	
		
		
}
