
package TestngBatchExecution;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClass {

	public WebDriver driver = null;

	@Parameters("browser")
	@BeforeClass
	public void browsersetup(String browsername ) {

		// configure the browser 1
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		// Configure the Browser2
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		// Configure the Browser3
		System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");

		System.out.println("Enter the Brwoser Name :");

		//String browsername = "chrome";

		if (browsername.equals("chrome")) {
			driver = new ChromeDriver();
		}

		else if (browsername.equals("firefox")) {
			driver = new FirefoxDriver();

		} else if (browsername.equals("edge")) {
			driver = new EdgeDriver();
		}

		else

		{
			System.out.println("U Have Entered Incorrect Browser");
			System.out.println("Enter the Valid Browser Name");

		}

		// Navigate To url
		driver.get("https://www.netflix.com/in/");

		Reporter.log("Browser Setup Success", true);
	}

	@BeforeMethod
	public void login() {
		Reporter.log("login Completed", true);
	}

	@AfterMethod
	public void logout() {
		Reporter.log("Logout Sucess", true);
	}

	@AfterClass
	public void browserclose() {

		driver.close();
		Reporter.log("Browser Closwed Success", true);

	}
}