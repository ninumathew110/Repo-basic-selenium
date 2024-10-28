package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_Relative {

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
	
	//identify the WE using xpath-Absolute Locator ,identify element1
	WebElement element1=driver.findElement(By.xpath("//textarea"));

	element1.sendKeys("Learning Selenium is interesting!!!!!!!");
	
	Thread.sleep(3000);
	//identify element2
	WebElement element2=driver.findElement(By.xpath("//a"));
	
	element2.click();
	
	//execution completed
	System.out.println("execution completed");

	}

}
