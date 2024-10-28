package Exam;

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

public class baseclass {
	public WebDriver driver = null;

	@Parameters("browser")
	@BeforeClass
	public void browsersetup(String browser ) {
		// configure diff browsers
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	
		System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");

		System.out.println("Enter the Browser Name");

		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equals("edge")) {
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println(" invalid Browser");
		}

	// Navigate To url
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("Browser setups", true);
	}
	@BeforeMethod
	public void login() {
		Reporter.log("login", true);
	}
	@AfterMethod
	public void logout() {
		Reporter.log("Logout", true);
	}
	@AfterClass
	public void browserclose() {
		driver.close();
		Reporter.log("Browser Closed", true);
	}
}






