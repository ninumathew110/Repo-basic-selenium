package TestngBasics;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest4 {

	@Test(priority = 1)
	public void elephant() {
		Reporter.log("elephant is coming", true);	
	}
	@Test(priority = 5)
	public void monkey() {
		Reporter.log("monkey is coming", true);	
	}
	@Test(priority = 3)
	public void dog() {
		Reporter.log("dog is coming", true);	
	}
	@Test(priority = 4)
	public void deer() {
		Reporter.log("deer is coming", true);		
	}
	@Test(priority = 2)
	public void cat() {
		Reporter.log("cat is coming", true);		
	}
}
