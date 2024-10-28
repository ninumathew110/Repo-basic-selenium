package HandlingPopUps;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindowpopups3 {

	public static void main(String[] args) throws InterruptedException {

		// Configure the Browser
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		// Step1:launch the browser
		WebDriver driver = new ChromeDriver();

		// Wait Statement
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Maximize the Browser
		driver.manage().window().maximize();

		// Step2:Navigate To Application via URL
		driver.get("https://www.shoppersstack.com/products_page/26");

		// Identify the Element Which Generates the Popups
		driver.findElement(By.id("compare")).click();

		// Handle Parent Window
		String parentId = driver.getWindowHandle();
		System.out.println(parentId);

		// Handle Child Windows
		Set<String> allwindowId = driver.getWindowHandles();
		System.out.println(allwindowId);

		// Scenario 1:Close all The Child Window
		// Scenario 2:Close only the parent Window
		// Scenario 3:Close only the Specific Child Window
		// Scenario 4:Close all The Windows-->Child and parent,Without Using Quit method

		// S3:Close Only The Specific Window-Amazon
		// Solution: By The Title
		for (String windowId : allwindowId)
		{
			// Switch the Control From Mainpage To Window
			driver.switchTo().window(windowId);
			
			// Fetch The Title
			String atitle = driver.getTitle();

			if (atitle.contains("Amazon.in")) 
			{
				// Close the Browser
				driver.close();

			}

		}

	}

}