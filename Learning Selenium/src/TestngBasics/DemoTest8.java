package TestngBasics;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoTest8 {
	@BeforeMethod
	public void beforemethod() {

	Reporter.log("Beforemethod Excuted ", true);
	Reporter.log("Executed Step 1---->Pass", true);
	Reporter.log("Executed Step 2---->Pass", true);
}

@AfterMethod
public void aftermethod() {

	Reporter.log("Aftermethod Excuted ", true);
	Reporter.log("Executed Step 4---->Pass", true);
	Reporter.log("Executed Step 5---->Pass", true);
}

@Test
public void Test1() {
	Reporter.log("Test1 Excuted ", true);

	Reporter.log("Executed Step 3---->Pass", true);

}

@Test
public void Test2() {
	Reporter.log("Test2 Excuted ", true);

	Reporter.log("Executed Step 3---->Pass", true);

}

@Test
public void Test3() {

	Reporter.log("Test3 Excuted ", true);

	Reporter.log("Executed Step 3---->Pass", true);

}

}