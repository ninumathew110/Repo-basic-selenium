package HandlingScrollAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScroll_UsingJSExecutor3 {

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
		driver.get("https://www.zomato.com/");

		// 1:Typecast from Webdriver Type To Jvscript Type
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// To perform Scroll Action ---> 3 ways of Js-code
		// ScrollAction Using 1.ScrollBy
		// ScrollAction Using 2.ScrollTo
		// ScrollAction Using 3.ScrollIntoview

		
		//Identify the Element To View
		WebElement element = driver.findElement(By.xpath("//h2[contains(text(),'Collections')]"));
		
		Thread.sleep(5000);
		// Call the Exceute script Method-ScrollIntoView--TOP
		js.executeScript("arguments[0].scrollIntoView(true)",element);

		
		Thread.sleep(5000);
		// Call the Exceute script Method-ScrollIntoView--Bottom
		js.executeScript("arguments[0].scrollIntoView(false)",element);


		System.out.println("Execution Completed");
	
	}

}
