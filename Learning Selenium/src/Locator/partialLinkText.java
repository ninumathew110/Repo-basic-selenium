package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class partialLinkText {

	public static void main(String[] args) throws InterruptedException
	{
		// Configure the Browser
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		// Step1:launch the browser
		WebDriver driver = new ChromeDriver();

		// Maximize the Browser
		driver.manage().window().maximize();

		// Step2:Navigate To Application via URL
		driver.get("file:///C:/Users/Windows/Downloads/webpage.html");
		
		//step3:Identify the WebElement using className locator
		// And Perform click Action
		driver.findElement(By.partialLinkText("Us")).click();
				
		//execution completed
		System.out.println("execution completed");

	}
}