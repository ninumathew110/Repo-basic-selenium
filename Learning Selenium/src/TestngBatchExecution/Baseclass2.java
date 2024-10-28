package TestngBatchExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Baseclass2 {

	// create Obj Ref of Webdriver Type
	public WebDriver driver = null;

	@BeforeMethod
	public void login() {
		Reporter.log("Login Done", true);
	}

	@AfterMethod
	public void logout() {
		Reporter.log("logout Done", true);

	}

	//Here We need to pass the parameterName which fetcing from suite .
	@Parameters("Browser")
	@BeforeClass
	public void browsersetup(String browsername) {

		// Configure the Browser
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");

//		System.out.println("Enter the Browser Name: ");
//		String browsername = "chrome";

		// if User gives browsername="chrome"
		if (browsername.equals("chrome")) {
			// Step1:Launch the Browser-Chrome
			driver = new ChromeDriver();
		}
		// if User gives browsername="firefox"
		else if (browsername.equals("firefox")) {
			// Step1:Launch the Browser-Firefox
			driver = new FirefoxDriver();
		}
		// if User gives browsername="edge"
		else if (browsername.equals("edge")) {
			// Step1:Launch the Browser-Edge
			driver = new EdgeDriver();
		}
		else {
			System.out.println("U have Entered Invalid Browser Name,Please  Check!!!!!");
		}
		
		// Step2:Navigate to the Application via URL
		driver.get("https://www.selenium.dev/");

		// Execution Completed Message
		Reporter.log("Browser Setup-Launched Success ", true);

	}

	@AfterClass
	public void quitbrowser() {

		// Close the Browser
		driver.quit();
		Reporter.log("Browser Closed Success", true);
	}

	@BeforeTest
	public void preTestConnection() {
		Reporter.log("Test-preConnection Build", true);
	}

	@AfterTest
	public void postTestConnection() {
		Reporter.log("Test-PostConnection Terminated", true);
	}

	@BeforeSuite
	public void PreSuiteConnection() {
		Reporter.log("Suite-preConnection Build-DB,AdvanceReport", true);
	}

	@AfterSuite
	public void PostSuiteConnection() {
		Reporter.log("Suite-PostConnection Terminated-DB,AdvanceReport", true);
	}

}