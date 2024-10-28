package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get {
	/**
	 * this class will tells that 'How the Get method from webdriver interface is used.
	 * It is used to navigate to the Application via URL by passing string argument
	 * its return type is void
	 */
	public static void main(String[] args) 
	{
		//configure the browser/setup
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");//key and value given same line so lines gets reduced
		
		//step1:launch the Browser-Chrome
			WebDriver driver=new ChromeDriver();
				
		//step2:Navigate to the Application via URL
			driver.get("https://www.swiggy.com/");
			
		//step3:Navigate to the different URL
			driver.get("https://www.swiggy.com/");
			
		//step4:Navigate to the different URL
			driver.get("https://www.amazon.in/");
			
		//step5:Navigate to the different URL
			driver.get("https://www.flipkart.com/");
			
		//close the browser
			driver.quit();
			
		//Execution completed message
			System.out.println("Execution completed message");	
			
			
	
	
	}

}
