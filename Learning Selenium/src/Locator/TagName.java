package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

	public static void main(String[] args) {
	
		// Configure the Browser
				System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

				// Step1:launch the browser
				WebDriver driver = new ChromeDriver();

				// Maximize the Browser
				driver.manage().window().maximize();

				// Step2:Navigate To Application via URL
				driver.get("file:///C:/Users/Windows/Downloads/webpage.html");

				// Step3: Identify the WebElement Using TagName
				driver.findElement(By.tagName("textarea")).sendKeys("If you want to create robust, browser-based regression automation suites and tests, scale and distribute scripts across many environments, then you want to use Selenium WebDriver, a collection of language specific bindings to drive a browser - the way it is meant to be driven.");

				// Step4:Identify the Email textField
				// It will Find the First matched Element of Tagname has input.
				driver.findElement(By.tagName("input")).sendKeys("admin123@gmail.com");

				// Step5s:Close the Browser
				// driver.close();

				// Execution Completed
				System.out.println("Execution Completed");
			}

		
		
	}


