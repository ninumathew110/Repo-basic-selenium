package TestngBatchExecution;
import org.testng.Reporter;
import org.testng.annotations.Test;

import TestngBatchExecution.BaseClass;

public class Test1 extends BaseClass{
	@Test
	public void addproduct() {
		Reporter.log("Product Added Success--Test--1", true);
	}

	
}