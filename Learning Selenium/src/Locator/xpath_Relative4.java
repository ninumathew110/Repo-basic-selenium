package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class xpath_Relative4 {
	public static void main(String[] args) throws InterruptedException {

	// Configure the Browser
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	// Step1:launch the browser
	WebDriver driver = new ChromeDriver();

	// Maximize the Browser
	driver.manage().window().maximize();

	// Step2:Navigate To Application via URL
	driver.get("file:///C:/Users/QSP/Downloads/webpage.html");
	Thread.sleep(5000);
	// Identify The Element 1--"Password:" Text:
	WebElement element1 = driver.findElement(By.xpath("//label[text()='Password:'  and  contains(text(),'Pass') ]"));
	element1.click();

	Thread.sleep(5000);
	// Identify The element 2--EmailTxtField
	WebElement element2 = driver.findElement(By.xpath("//input[contains(@class,'emailtxt') and @type='email' ]"));
	element2.sendKeys("admin123@gmail.com");

}


}
