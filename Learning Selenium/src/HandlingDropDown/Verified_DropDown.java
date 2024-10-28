package HandlingDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//verify the dropdown is single select or not?

public class Verified_DropDown {

	public static void main(String[] args) {
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
		// WebElement dropdown2 = driver.findElement(By.name("country2"));
		 
		//step4:Create an object for select class and pass the drop down reference
		Select selectobj = new Select(dropdown1);
		//Select selectobj = new Select(dropdown2);
		
		//step5:call the non-static method using select reference variable.
		boolean result = selectobj.isMultiple();
		
		if (result)
		{
			System.out.println("dropdown is multi-select");
		}
		else
		{
			System.out.println("dropdown is single-select");
		}
	}

}
