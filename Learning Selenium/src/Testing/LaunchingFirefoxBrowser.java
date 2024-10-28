package Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingFirefoxBrowser 
{
	public static void main(String[] args) 
	{
	//key 
	//value
	//configure the browser
	//step1:Launch the browser
	//step2:Navigate to the appln via URL
	
		String key="webdriver.gekco.driver";
		
		String value="./driver/gekcodriver.exe";
		
		System.setProperty(key, value);
		
		//step1:launch the Browser-Firefox
		WebDriver driver=new FirefoxDriver();
		
		//step2:Navigate to the Application via URL
		driver.get("https://www.selenium.dev/");
		
		//Execution completed message
		System.out.println("Execution completed message");
		
	}

}
