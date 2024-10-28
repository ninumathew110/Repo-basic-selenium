
package HandlingFrame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) throws InterruptedException {

		// Configure the Browser
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		// Step1:launch the browser
		WebDriver driver = new ChromeDriver();

		// Wait Statement
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Maximize the Browser
		driver.manage().window().maximize();

		// Step2:Navigate To Application via URL
		driver.get("file:///C:/Users/Windows/Downloads/EmbededWebpage.html");

		// Step3:Enter Your emailId "admin123@gmail.com" in the Mainpage.
		driver.findElement(By.id("email")).sendKeys("admin123@gmail.com");
		Thread.sleep(3000);

		// Handle The Frame
		// Switch The Control From MainPage To Frame-Using Index
		//driver.switchTo().frame(1);

		// Switch The Control From MainPage To Frame-Using Name Attribute
		driver.switchTo().frame("frame1");

		// Switch The Control From MainPage To Frame-Using WebElement
		//driver.switchTo().frame(driver.findElement(By.xpath("")));

		// Step4:Enter The SearchData "Computer" inside Search Box in Frame.
		driver.findElement(By.id("small-searchterms")).sendKeys("Computer");

		// Handle The Frame
		// SwitchBack The Control From Frame To MainPage-Using DefaultContent
		driver.switchTo().defaultContent();

		Thread.sleep(3000);
		// Step5: Enter The Password "admin#123"In The Main page.
		driver.findElement(By.id("password")).sendKeys("admin#123");
		Thread.sleep(3000);

		// Close the Browser
		driver.close();

		// Execution Completed
		System.out.println("Exceution Completed");

	}

}