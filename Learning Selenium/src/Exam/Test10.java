package Exam;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;
import org.testng.Reporter;
public class Test10 extends BaseclassTest7to9{

	@Test
	public void Properfilefetching() throws IOException {
	
	//from external file to java readable
	FileInputStream data = new FileInputStream("./data/testdata.txt");
		
	//Object for properties file
	Properties obj1 = new Properties();
		
	//Fetching property
	obj1.load(data);
		
	//step4:Read/get the data and print them
		String url = obj1.getProperty("url");	
		System.out.println(url);
	}	
		@Test
	public void Assertion() {
			
	//verifying using assertion
	String expTITLE="Learning Selenium";
	String actualTITLE=driver.getTitle();
		
	boolean expTITLE1 = true;
	boolean actualTITLE1 =true;
		
	//creating object for soft assert
	SoftAssert softassert = new SoftAssert();
				
	//giving conditions 
	softassert.assertEquals(actualTITLE1,expTITLE1);
				
	//mandatory method if any exceptions at end
	softassert.assertAll();
				
			}	
	@Test
	public void POM() throws EncryptedDocumentException, IOException  {
		
		

		// convert The external source File To Java file.
		FileInputStream file = new FileInputStream("./data/exam.xlsx");			

		//create workbook and save
		Workbook workbook = WorkbookFactory.create(file);
		
		//Using workbook,fetch the Sheet
		Sheet sheet = workbook.getSheet("Details");
		
		//Using sheet,fetching row
		Row row = sheet.getRow(1);

		//Using row getting column
		Cell column = row.getCell(0);

		// Using column getting all data
		String d1 = column.getStringCellValue();
		
		//getting and displaying
		String d2 = workbook.getSheet("Details").getRow(1).getCell(1).getStringCellValue();
		Reporter.log(d1, true);
		
		
	}
	
	
	}
	
	

