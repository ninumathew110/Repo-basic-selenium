package Exam;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Test8 extends BaseclassTest7to9{
	@Test
	public void screenshots() throws IOException {
		
		//Perform Type casting
		TakesScreenshot sc=(TakesScreenshot) driver;
		
		//call the Screenshot Method
		File temp = sc.getScreenshotAs(OutputType.FILE);
		
		//Permanent Path for Screenshot
		File permt = new File("./screenshot/shots.png");
		
		//Copy Screenshot From Temporary To Permanent Path
		FileHandler.copy(temp, permt);
		
	}

}
