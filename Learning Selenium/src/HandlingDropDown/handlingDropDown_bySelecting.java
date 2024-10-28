package HandlingDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handlingDropDown_bySelecting {
	public static void main(String[] args) throws InterruptedException {

	//configure the browser/setup
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	//step1:launch the Browser-Chrome
	WebDriver driver=new ChromeDriver();	
	
	//Maximize the browser  
	driver.manage().window().maximize();//using method chaining we are calling diff methods here
	
	//step2:Navigate to appln via URL
	driver.get("file:///C:/Users/Windows/Downloads/webpage.html");

	//STEP 3:Identify the drop down
	 WebElement dropdown1 = driver.findElement(By.name("country1"));
	 WebElement dropdown2 = driver.findElement(By.name("country2"));
	 
	//step4:Create an object for select class and pass the drop down reference
	Select selectobj = new Select(dropdown1);
	
	//call non-static method-select method-->3 WAYS
	Thread.sleep(3000);
	//select option using index
	selectobj.selectByIndex(1);
	
	Thread.sleep(3000);
	//Select option using visibleText
	selectobj.selectByValue("usa");
	
	Thread.sleep(3000);
	//Select option using visibleText
	selectobj.selectByVisibleText("CANADA");
	
	System.out.println("Execution Completed");
}
}