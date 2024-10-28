package TestNgReadPropertyFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadPropertyFile 
{
	@Test
	public void DemoTest() throws IOException{
	
	//step1:convert the physical file to java understandable .(fileinputstream class)
	FileInputStream file = new FileInputStream("./data/commondata.properties.txt");
	
	//step2:create an object for the properties class
	Properties propertyobj = new Properties();
	
	//STEP3:load all property
	propertyobj.load(file);
	
	//step4:Read/get the data and print them
	String Data1 = propertyobj.getProperty("url");
	String Data2 = propertyobj.getProperty("username");
	String Data3 = propertyobj.getProperty("password");
	String Data4 = propertyobj.getProperty("browser");
	System.out.println(Data1);
	System.out.println(Data2);
	System.out.println(Data3);
	System.out.println(Data4);

	//HOW TO WRITE FROM PROPERTY FILE
	
	//step1:write the data(suing put(key,value))
	propertyobj.put("name", "Harry");
	
	//step2:convert the data from java to file(FileOutputStream class)
	FileOutputStream fos = new FileOutputStream("./data/commondata.properties.txt");
	
	//step3:save/store the data
	propertyobj.store(fos, "Updated New key-Name");
	
	System.out.println("Execution completed");
	
	
	}	
	
}
