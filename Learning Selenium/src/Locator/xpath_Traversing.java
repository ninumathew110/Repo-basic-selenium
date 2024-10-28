package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_Traversing {//TO traverse from feedback text area -> mobile number textfield

	public static void main(String[] args) throws InterruptedException {
		// Configure the Browser
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		// Step1:launch the browser
		WebDriver driver = new ChromeDriver();

		// Maximize the Browser
		driver.manage().window().maximize();

		// Step2:Navigate To Application via URL
		driver.get("file:///C:/Users/Windows/Downloads/webpage.html");
		
		Thread.sleep(5000);
		//identify the WE using xpath-traverse[	from Name textfield->feedback text area] 
		WebElement element1=driver.findElement(By.xpath("//input[contains(@placeholder,'name')]/../../../tr[9]/td[2]/textarea"));
		//WebElement element1=driver.findElement(By.xpath("//input[contains(@placeholder,'name')]/../../..//textarea"));
		element1.sendKeys("Learning selenium is easy ");											//XpathByTraversing
			
		
		Thread.sleep(5000);
		//identify the WE using xpath-traverse[Mobile no text field->place Label Bangalore] ,identify element1
		WebElement element2=driver.findElement(By.xpath("//input[@placeholder='Enter your Mobile No ']/../../..//label[@for='bangalore']"));
		element2.click();	
		
		
		//execution completed
		System.out.println("execution completed");
		
		Thread.sleep(5000);
		//close browser
		driver.quit();
	}

}
