package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_Sibling_Traversing {//using relative xpath
	public static void main(String[] args) throws InterruptedException {

		// Configure the Browser
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		// Step1:launch The Browser
		WebDriver driver = new ChromeDriver();

		// Maximize the Browser
		driver.manage().window().maximize();

		// Step2:Navigating to The Application via URL
		driver.get("file:///C:/Users/QSP/Downloads/webpage.html");

		Thread.sleep(5000);
		// Step3: Identify the WE using xpath locator--Axes-Sibling Traversing(preceding)
		driver.findElement(By.xpath("//tr[6]/preceding-sibling::tr[2]//input")).sendKeys("9876543210");
		
		Thread.sleep(5000);
		// Step3: Identify the WE using xpath locator--Axes-Sibling Traversing(following)
		driver.findElement(By.xpath("//tr[6]/following-sibling::tr[3]//textarea")).sendKeys("Learning Selenium through Online...");
		
	//execution completed
	System.out.println("execution completed");
			
	Thread.sleep(5000);
	//close browser
	driver.quit();
}
}