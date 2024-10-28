package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_Axes {
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
		//identify the WE using xpath_Axes[FEEDBACK text area ] ,identify element1
		WebElement element1=driver.findElement(By.xpath("//input/following::textarea"));
													//XpathByAxes
		element1.sendKeys("Learning selenium is easy ");												
			
		Thread.sleep(5000);
		//PLACES->BANGLORE(RADIO BUTTON)[3 ways of path given]
		//identify the WE using xpath_Axes[from password->register WE] ,identify element1
		//WebElement element2=driver.findElement(By.xpath("//input[contains(@placeholder,'name')]/parent::td/parent::tr/parent::tbody/child::tr[7]/child::td[2]/child::label[3]"));
		//WebElement element2=driver.findElement(By.xpath("//input[contains(@placeholder,'name')]/following::label[@for='bangalore']"));									
		WebElement element2=driver.findElement(By.xpath("//input[contains(@placeholder,'name')]/following::label[@for='bangalore']"));
		element2.click();	
		
		Thread.sleep(3000);
		//FEEDBACK text area
		WebElement element3 = driver.findElement(By.xpath("//input/following::textarea"));
		element3.clear();
		
		//execution completed
		System.out.println("execution completed");
		
		Thread.sleep(5000);
		//close browser
		driver.quit();
	}
}
