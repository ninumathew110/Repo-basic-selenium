package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {
	public static void main(String[] args) throws InterruptedException {

	// Configure the Browser
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	// Step1:launch the browser
	WebDriver driver = new ChromeDriver();

	// Maximize the Browser
	driver.manage().window().maximize();
			
	// Step2:Navigate To Application via URL
	driver.get("https://www.selenium.dev/");
	
	//step3:identify the WE
	WebElement element1 = driver.findElement(By.xpath("//h1[contains(@class,fw-bold)]"));
	
	//STEP4:expectedText:-"Selenium automates browsers. That's it!"
	String Expectedtext= "Selenium automates browsers. That's it!";
	
	//STEP5:ActualText:-fetch the textvalue
	String Actualtext= element1.getText();
	
	if (Expectedtext.equals(Actualtext))
	{
		System.out.println("test step- pass");
	}	
		else
		{
			System.out.println("Test step- fail");
	}
	
	//print on console
	System.out.println("Text Value is"+Actualtext);
	
	//execution completed
	System.out.println("execution completed");
									
	Thread.sleep(4000);
	//close browser
	driver.quit();
	
	}	
	
}
