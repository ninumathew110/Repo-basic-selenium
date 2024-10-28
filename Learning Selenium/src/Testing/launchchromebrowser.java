package Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchchromebrowser {
	public static void main(String[] args) 
	{
		//IT IS ACCESS KEY FOR THE EXECUTABLE FILES
		String key="webdriver.chrome.driver";
		
		//Its a path of the driverExecutable file
		String value="./driver/chromedriver.exe";
		
		//configure the browser/setup
		System.setProperty(key, value);
		//setproperty:static method which is present in ,to set the properties of executable files.
		
		//step1:launch the Browser-Chrome
		WebDriver driver=new ChromeDriver();
		
		//step2:Navigate to the Application via URL
		
		driver.get("https://www.swiggy.com/");
		
		//Execution completed message
				System.out.println("Execution completed message");
	}

}
