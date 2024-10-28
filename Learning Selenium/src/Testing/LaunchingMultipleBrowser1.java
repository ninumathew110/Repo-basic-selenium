package Testing;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingMultipleBrowser1 {

	public static void main(String[] args) {

		// Its is Access Key for the Executable File
		String key1 = "webdriver.chrome.driver";
		String key2 = "webdriver.gecko.driver";
		String key3 = "webdriver.edge.driver";

		// Its a path of the DriverExecutable File
		String value1 = "./driver/chromedriver.exe";
		String value2 = "./driver/geckodriver.exe";
		String value3 = "./driver/msedgedriver.exe";

		// Configure the Browser
		System.setProperty(key1, value1);
		System.setProperty(key2, value2);
		System.setProperty(key3, value3);

		// create Obj Ref of Webdriver Type
		WebDriver driver = null;

		// Create an object for Scanner Class
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Browser Name: ");
		String browsername = scanner.next();

//------------------------------------------------------------------
		// if User gives browsername="chrome"
		if (browsername.equals("chrome")) {

			// Step1:Launch the Browser-Chrome
			driver = new ChromeDriver();

		}
//------------------------------------------------------------------
		// if User gives browsername="firefox"
		else if (browsername.equals("firefox")) {

			// Step1:Launch the Browser-Firefox
			driver = new FirefoxDriver();
		}
//-------------------------------------------------------------------
		// if User gives browsername="edge"
		else if (browsername.equals("edge")) 
		{
			// Step1:Launch the Browser-Edge
			driver = new EdgeDriver();

					}
// -------------------------------------------------------------------

		else {

			System.out.println("U have Entered Invalid Browser Name,Please  Check!!!!!");
		}
//--------------------------------------------------------------------
		// Step2:Navigate to the Application via URL
		driver.get("https://www.selenium.dev/");

		// Execution Completed Message
		System.out.println("Execution Completed Message");

	}

}