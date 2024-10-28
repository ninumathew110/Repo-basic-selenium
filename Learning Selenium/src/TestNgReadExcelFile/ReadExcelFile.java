package TestNgReadExcelFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReadExcelFile {

	@Test
	public void demotest() throws EncryptedDocumentException, IOException {

		// Step1:Convert The Physical File To Java Undersatandable.(FileInputStream
		// Class)
		FileInputStream fis = new FileInputStream("./data/Empdetails.xlsx");

		// Step2:Create The Workbook And Store It
		Workbook workbook = WorkbookFactory.create(fis);

		// Step3:Using WorkBook,Get the Sheet
		Sheet sheet = workbook.getSheet("Registerdetails");

		// Step3:Using Sheet,Get the Row
		Row row = sheet.getRow(1);

		// Step5:Using Row,Get the Column
		Cell column = row.getCell(0);

		// Step6:Using Column,Get the Data
		String data1 = column.getStringCellValue();

		// Optimized Code
		String data2 = workbook.getSheet("Registerdetails").getRow(1).getCell(1).getStringCellValue();
		String data3 = workbook.getSheet("Registerdetails").getRow(1).getCell(2).getStringCellValue();
		double data4 = workbook.getSheet("Registerdetails").getRow(1).getCell(3).getNumericCellValue();

		// Display On data
		Reporter.log(data1, true);
		Reporter.log(data2, true);
		Reporter.log(data3, true);
		Reporter.log("+91" + data4, true);

		// How To Write The Data From ExcelFile:
		// Step1:Write the Data ()
		workbook.getSheet("Registerdetails").createRow(2).createCell(6).setCellValue("Learning Selenium From Harry");
		
		// Step2:Convert The data From Java To File(FileOutputStream Class)
		FileOutputStream fos = new FileOutputStream("./data/Empdetails.xlsx");

		// Step3:Save/Store The Data.
		workbook.write(fos);

		// Step4:Close the Workbook
		workbook.close();

		System.out.println("Execution Completed");

	}

}