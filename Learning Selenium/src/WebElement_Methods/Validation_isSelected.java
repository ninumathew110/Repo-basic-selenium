package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation_isSelected {
	public static void main(String[] args) throws InterruptedException {
	// Configure the Browser
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	// Step1:launch the browser
	WebDriver driver = new ChromeDriver();

	// Maximize the Browser
	driver.manage().window().maximize();
			
	// Step2:Navigate To Application via URL
	driver.get("file:///C:/Users/Windows/Downloads/webpage.html");
			
	Thread.sleep(3000);
	//step3:Identify the WE-Goa check box--Action_clear
	WebElement element1=driver.findElement(By.id("goa"));

	
	//step4:validate the element
	boolean result=element1.isSelected();
	
	if (result==true)
	{
		System.out.println("Element verified _it is aleardy selected");
	}	
		else
		{
			System.out.println("Element verified _it is not selected");
	}
		//step5:Perform action-click
		element1.click();//to deselect that option
		
		//execution completed
		System.out.println("execution completed");
								
		Thread.sleep(4000);
		//close browser
		driver.quit();
	}

}
