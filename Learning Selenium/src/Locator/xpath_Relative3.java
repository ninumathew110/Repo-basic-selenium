package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_Relative3 {
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
	
	Thread.sleep(5000);
	//identify the WE using xpath-Absolute Locator ,identify element1
	WebElement element1=driver.findElement(By.xpath("//label[text()='Email:']"));
	element1.click();											//XpathByText
	
	Thread.sleep(5000);
	//identify element2
	WebElement element2=driver.findElement(By.xpath("//label[contains(text(),'pass')]"));
													//XpathByPartialText
	element2.click();
	
	
	//execution completed
	System.out.println("execution completed");
}
}
