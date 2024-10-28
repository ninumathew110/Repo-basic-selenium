package WebDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximiseBrowser {

	public static void main(String[] args) {
	//configure the browser/setup
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");//key and value given same line so lines gets reduced
				
	//step1:launch the Browser-Chrome
	WebDriver driver=new ChromeDriver();
						
	//step2:Navigate to the Application via URL
	driver.get("https://www.swiggy.com/");
	
	//Maximize the browser  //minimize option is not available now.
	driver.manage().window().maximize();//using method chaining we are calling diff methods here
	
//-----------------------------------------------------------------------------------------------------------					
	//set the size for the browser
	Dimension size = new Dimension(500,500) ;//width,height
	//driver.manage().window().setSize(size);
	
	//driver.manage().window().setSize(new Dimension (700,500));
					
	driver.manage().window().setSize(new Dimension (700,200));	
//----------------------------------------------------------------------------------------------------------	
	//set the position for browser
	Point position =new Point (200,200);
	//driver.manage().window().setPosition(position);
	driver.manage().window().setPosition(new Point(300,300));
//------------------------------------------------------------------------------------------------
	
	//Full screen the browser
	driver.manage().window().fullscreen();

	}

}
