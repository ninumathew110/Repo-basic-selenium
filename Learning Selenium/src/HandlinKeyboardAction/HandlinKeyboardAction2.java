package HandlinKeyboardAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlinKeyboardAction2 {

	public static void main(String[] args) {
		// Configure the Browser
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		// Step1:launch the browser
		WebDriver driver = new ChromeDriver();

		// Maximize the Browser
		driver.manage().window().maximize();

		// Waiting Statement-Implicitly Wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Step2:Navigate To Application via URL
		driver.get("https://demowebshop.tricentis.com/");

		// Create Object For Actions Class
		Actions action = new Actions(driver);

		// To Perfom Keyboard Action-->Using Keys Class
		action.sendKeys(Keys.TAB, Keys.TAB, Keys.TAB).perform();

		// Enter The Data By using Sendkeys
		driver.findElement(By.id("Email")).sendKeys("admin123@gmail.com", Keys.TAB, "Admin123@#");
	}

}