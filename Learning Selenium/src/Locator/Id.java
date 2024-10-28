package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id {

	public static void main(String[] args) throws InterruptedException {
	
		//configure the browser/setup
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			
		//step1:launch the Browser-Chrome
		WebDriver driver=new ChromeDriver();	
		
		//Maximize the browser  
		driver.manage().window().maximize();//using method chaining we are calling diff methods here
		
		//step2:Navigate to appln via URL
		driver.get("file:///C:/Users/Windows/Downloads/webpage.html");//particular link taken from my downloads an application given by trainer to download
		
		//step3:identify the webelement using Id locator
		WebElement element1 = driver.findElement(By.id("name"));
		
		Thread.sleep(5000);
		//step4: perform clear action
		element1.clear();
		
		//step5:identify the WebElement-NameTxtfield using->ID Loctor
		WebElement element2=driver.findElement(By.id("email"));
		
		Thread.sleep(5000);
		//step6:Perform sendkeys action
		element2.sendKeys("admin123@gmail.com");
		
		//step7:identify the Webelement-manali-checkbox->Id Locator
		WebElement element3=driver.findElement(By.id("manali"));
		
		Thread.sleep(5000);
		//perform click action
		element3.click();
		
		//close browser
		//driver.quit();
		
		//execution completed
		System.out.println("execution completed");
		
		

	}

}
