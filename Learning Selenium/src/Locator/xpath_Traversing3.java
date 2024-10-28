package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_Traversing3 {
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
		//identify the WE using xpath-traverse[from password text field->register button] ,identify element1
		//WebElement element1=driver.findElement(By.xpath("//input[contains(@placeholder,'Enter your Password')]/../../../tr[11]/td[1]/input"));
		WebElement element1=driver.findElement(By.xpath("//input[contains(@placeholder,'Enter your Password')]/../../..//input[@id='reg']"));										
		element1.click();											
			
		//execution completed
		System.out.println("execution completed");
		
		Thread.sleep(4000);
		//close browser
		driver.quit();
	}
}



