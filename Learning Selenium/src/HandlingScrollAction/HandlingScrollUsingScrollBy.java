package HandlingScrollAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollUsingScrollBy {public static void main(String[] args) throws InterruptedException {

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

	//step to perform scroll action
	
	//perform typecasting
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	Thread.sleep(3000);
	
	//call the abstract method to perform js code
	js.executeScript( "window.scrollBy(0,500)");
	
	Thread.sleep(3000);
	
	//2.call the abstract method to perform js code
	js.executeScript( "window.scrollBy(0,500)");
	
	Thread.sleep(3000);
	
	//3.call the abstract method to perform js code
	js.executeScript( "window.scrollBy(0,500)");
	
	System.out.println("Execution Completed");
}
}