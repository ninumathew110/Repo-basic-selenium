package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelector {
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
				
				//Identify the element Using  CssSelector Locator
				driver.findElement(By.cssSelector("textarea")).sendKeys("ehsrfdgshoievj0v9cw90pc8uc0");
				driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Admin123#@");
				driver.findElement(By.cssSelector("input[placeholder='Enter your Mobile No ']")).sendKeys("9876543210");
				
				//execution completed
				System.out.println("execution completed");

	
	
	
	}
	
	
	}

