package Synchronisation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWait {

	public static void main(String[] args) {
		// Configure the Browser
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		// Step1:launch the browser
		WebDriver driver = new ChromeDriver();
		
		// Maximize the Browser
		driver.manage().window().maximize();
		
		//wait statement:Implicitly wait(Global wait)
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);//standard,commonly we use seconds as timeouts
		
		// Step2:Navigate To Application via URL
		driver.get("https://www.shoppersstack.com/");
		
		//wait statement:Explicitly wait(based on condition it will wait)
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		//condition1:to wait
		wait.until(ExpectedConditions.elementToBeClickable(By.id("loginBtn")));//customised waiting categories
		
		//condition2:to wait
		wait.until(ExpectedConditions.titleContains("ShoppersStack"));//customised waiting categories
		
		//condition3:to wait
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("loginBtn"))));//customised waiting categories
		
		//condition4
		//wait.until(ExpectedConditions.attributeToBe(By.id(""),"Attributes Name", ""));
		
		//STEP3:IDENTIFY THE ELEMENT
		driver.findElement(By.xpath("loginBtn")).click();

		//execution completed
		System.out.println("execution completed");
				
		
		
	}

}
