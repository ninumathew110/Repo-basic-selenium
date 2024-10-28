package TestngBatchExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test4 extends Baseclass2{

	@Test(groups = "FunctionalityTest")
	public void Addproduct() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Reporter.log(" Test 4-Product Added Success", true);
	}
	
	@Test(groups = "IntegrationTest")
	public void Removeproduct() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Reporter.log(" Test 4-Product Removed Success", true);
	}

}