 package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classname {

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
		
		Thread.sleep(3000);
		//step3:Identify the WebElement using className locator
		// And Perform Clear Action
		driver.findElement(By.className("nametxt")).clear();
		driver.findElement(By.className("emailtxt")).sendKeys("admin123@gmail.com");
		driver.findElement(By.className("pswtxt")).sendKeys("admin123#@");
		driver.findElement(By.className("mbltxt")).sendKeys("9874563213");
		
		//CLOSE THE BROWSER
		driver.quit();
		
		//execution completed
		System.out.println("execution completed");
	}

}
