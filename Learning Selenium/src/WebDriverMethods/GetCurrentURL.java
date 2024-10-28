package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentURL {
	/**
	 *This class will describes that how getCurrentUrl method will work.
	 *Its an Abstract  method in WebDriver Interface
	 *its used to fetch the current url of webpage,where driver control is present.
	 *used to verify the webpage
	 *its return type is string
	 * **/
	
public static void main(String[] args) {
		
			//configure the browser/setup
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");//key and value given same line so lines gets reduced
					
			//step1:launch the Browser-Chrome
			WebDriver driver=new ChromeDriver();
							
			//step2:Navigate to the Application via URL
			driver.get("https://www.swiggy.com/");
			
			//step4:verify that home page of Swiggy is opened or not
			String c_url=driver.getCurrentUrl();//fetch current 
					
			//close the browser
			driver.quit();
			
			//step5:Print it on console
			System.out.println("current URL is :"+c_url);//string concatenation 
			
			//Execution completed message
			System.out.println("Execution completed message");	
		}

	}



