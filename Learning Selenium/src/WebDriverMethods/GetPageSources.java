 package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSources {
/**
 * This class will describes that how GetPageSource method will work.
 * its also an abstract method.
 * its used to fetch the web page source code (HTML)
 * Its return type is string
 */
	public static void main(String[] args) {
		
	//configure the browser/setup
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");//key and value given same line so lines gets reduced
					
			//step1:launch the Browser-Chrome
			WebDriver driver=new ChromeDriver();
							
			//step2:Navigate to the Application via URL
			driver.get("https://www.swiggy.com/");
			
			//step3:fetch the page source
			String pagesource=driver.getPageSource();

			//close the browser
			driver.close();
			
			//step4:print on console
			System.out.println(pagesource);
			
			//Execution completed message
			System.out.println("Execution completed message");	
			
			
	
	}
	
}
