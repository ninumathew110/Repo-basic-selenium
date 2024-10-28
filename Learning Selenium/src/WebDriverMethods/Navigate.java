package WebDriverMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException,MalformedURLException {
		
	//configure the browser/setup
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			
	//step1:launch the Browser-Chrome
	WebDriver driver=new ChromeDriver();	
		
	Thread.sleep(2000);//To analyze the test script execution-->sleeping statement/waiting statement
	
	//Maximize the browser  
	driver.manage().window().maximize();//using method chaining we are calling diff methods here
	
	//step2:Navigate to the Application via URL---using Navigate--to(String)
	driver.get("https://www.swiggy.com/");
	
	//step2:Navigate to the Application via URL---using Navigate--to(String)
	driver.navigate().to("https://www.flipkart.com/");
	
	//step2:Navigate to the Application via URL---using Navigate--to(String)
	driver.navigate().to(new URL("https://www.youtube.com/"));
		
	//Navigate towards backward
	driver.navigate().back();
	
	//Navigate towards forward
	driver.navigate().forward();

	Thread.sleep(2000);//To analyze the test script execution-->sleeping statement/waiting statement
	
	//Navigate of refresh
	driver.navigate().refresh();
	
	//close browser
	driver.quit();
	
	//
	
	

	
		
	
	
	}

}
