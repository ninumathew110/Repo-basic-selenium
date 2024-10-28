package HandlingPopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertPopUps {

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
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		Thread.sleep(3000);
		// Identify Popup Generates Button and Click
		driver.findElement(By.xpath("//button[contains(text(),'Prompt')]")).click();

		// Handle The Alert-Popup

		// By Switch The Control From MainPage To AlertPopups
		Alert alertpopup = driver.switchTo().alert();

		// 1.Fetch the Alert Message
		String alertmsg = alertpopup.getText();
		// String alertmsg = driver.switchTo().alert().getText();
		System.out.println("Alert Message : " + alertmsg);

		// 2.Pass the Data in Alert
		alertpopup.sendKeys("Learning Selenium is Easy...!!!!!!");
		//driver.switchTo().alert().sendKeys("Learning Selenium is Easy...!!!!!!");
		Thread.sleep(5000);

		// 3.Click On Ok Button in the Alert
		alertpopup.accept();
		//driver.switchTo().alert().accept();
		
		//OR
		
		// 4.Click On Cancel Button in The Alert
		// alertpopup.dismiss();
		//driver.switchTo().alert().dismiss();
		

		Thread.sleep(5000);
		// Close the Browser
		driver.quit();

	}

}