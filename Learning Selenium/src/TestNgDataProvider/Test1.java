package TestNgDataProvider;

import org.testng.annotations.Test;

public class Test1 extends BaseClass {

	@Test(dataProvider = "RegisterData")
	public void DemoTest(String name,int id,String dept)
	{
		System.out.println(name);
		System.out.println(id);
		System.out.println(dept);
	}
}
