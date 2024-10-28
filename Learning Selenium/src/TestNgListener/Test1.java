package TestNgListener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(TestngListener.ListenerImplementation.class)
public class Test1 {
	
	@Test
	public void Demotest() {
		Assert.fail();
		Reporter.log("Demotest Executed", true);
	}

}