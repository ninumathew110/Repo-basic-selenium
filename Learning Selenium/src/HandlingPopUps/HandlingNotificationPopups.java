package HandlingPopUps;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingNotificationPopups {

	public static void main(String[] args) {

		// Configure the Browser
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		
		//Handle the Notification Popups
		//Customize the Browser settings
		ChromeOptions chromeopt = new ChromeOptions();
		
		//Customized Setting--1.Disabled Notification
		chromeopt.addArguments("--disable-notifications");
		
		// Step1:launch the browser
		WebDriver driver = new ChromeDriver(chromeopt);

		// Wait Statement
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Maximize the Browser
		driver.manage().window().maximize();

		// Step2:Navigate To Application via URL
		driver.get("https://www.easemytrip.com/");

	}

}