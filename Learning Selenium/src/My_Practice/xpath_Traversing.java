package My_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_Traversing {
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
		//identify the WE using xpath-traverse[from Mobile text field->Banglore radio button] ,identify element1
		WebElement element1=driver.findElement(By.xpath("//input[contains(@type,'tel')]/../../../tr[7]/td[2]/input[@id='bangalore']"));
					
		element1.click();											
			
		//execution completed
		System.out.println("execution completed");
		
		Thread.sleep(4000);
		//close browser
		driver.quit();
	}
}
