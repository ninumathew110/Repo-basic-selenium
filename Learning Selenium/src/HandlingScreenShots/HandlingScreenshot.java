package HandlingScreenShots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class HandlingScreenshot {

	public static void main(String[] args) throws IOException {
		// Configure the Browser
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		// Step1:launch the browser
		WebDriver driver = new ChromeDriver();
		
		//Navigate To URL
		driver.get("https://www.google.com/");
		
		//Step1:Perform Type casting
		TakesScreenshot ts=(TakesScreenshot) driver;
		
		//Step2: call the Screenshot Method
		File temp = ts.getScreenshotAs(OutputType.FILE);
		
		//Step3:Create the Permanent Path for Screenshot
		File permanent = new File("./screenshot/ThirdScreenshot.png");
		
		//Step4:Copy the Screenshot From Temp To Permanent Path
		FileHandler.copy(temp, permanent);
		
		//close the Browser
		driver.quit();
		
		//Confirm Message
		System.out.println("Execution Completed");

	}

}