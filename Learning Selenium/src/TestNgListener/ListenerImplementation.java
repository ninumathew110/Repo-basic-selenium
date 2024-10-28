package TestNgListener;


import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerImplementation extends Baseclass implements ITestListener {
	@Override
	public void onTestFailure(ITestResult result) {
		//Fetch The TEST METHOD NAME
		String name = result.getName();
		
		// We Will Provide the Take Screenshot Steps
		// 1.Perform Typescating
		// 2.Call the Screenshot Method
		// 3.Store the Screenshot in Temp path
		// 4.Create the Storage For Permanent path
		// 5.Copy The Screenshot From Temp To Permanent
		Reporter.log("Taking The Screenshot  Success===>"+name, true);
	}

}