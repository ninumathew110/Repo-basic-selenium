package WebDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage {

	public static void main(String[] args) throws InterruptedException 
	{	
	//configure the browser/setup
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	//step1:launch the Browser-Chrome
	WebDriver driver=new ChromeDriver();	
	
	Thread.sleep(2000);//To analyze the test script execution-->sleeping statement/waiting statement
	//Maximize the browser  
	driver.manage().window().maximize();//using method chaining we are calling diff methods here
	
	Thread.sleep(2000);
	//Full screen the browser
	driver.manage().window().fullscreen();
	
	Thread.sleep(2000);
	//set the size/get the size for browser
	Dimension size_browser =driver.manage().window().getSize();
	System.out.println("size of browser"+size_browser);	
	driver.manage().window().setSize(new Dimension (500,500));
	
	Thread.sleep(2000);
	//set the position/get the position for browser
	Point position_browser= driver.manage().window().getPosition();
	System.out.println("position of browser"+position_browser);
	driver.manage().window().setPosition(new Point(300,300));
	
	Thread.sleep(2000);
	//step2:Navigate to the Application via URL
	driver.get("https://www.swiggy.com/");
	
	
		
	}

}
