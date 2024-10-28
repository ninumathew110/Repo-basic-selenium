package HandlingDisabledElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDisabledelement {
	public static void main(String[] args) throws InterruptedException {
		
	// Configure the Browser
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	// Step1:launch the browser
	WebDriver driver = new ChromeDriver();

	// Maximize the Browser
	driver.manage().window().maximize();

	// Waiting Statement-Implicitly Wait
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	// Step2:Navigate To Application via URL
	driver.get("https://demoapp.skillrary.com/");

	//Identify the Disabled-Element
	WebElement element = driver.findElement(By.xpath("(//input[contains(@class,'form-control')])[2]"));
				
	//verify the Element is Enabled or Not
	boolean result = element.isEnabled();
	if (result) {
				
		System.out.println("Enabled");
		
		}
			else 
		{
			System.out.println("NOT Enabled");
		}
				
	// 1:Typecast from Webdriver Type To Jvscript Type
		JavascriptExecutor js = (JavascriptExecutor) driver;
				
		Thread.sleep(5000);
		// Call the Exceute script Method-handling Disabled Element
		js.executeScript("arguments[0].value='Seleniumis Easy!!';",element);
				
		//element.sendKeys("Selenium is Easy");
				
	}

}