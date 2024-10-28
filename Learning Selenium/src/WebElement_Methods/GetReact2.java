package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetReact2 {
	public static void main(String[] args) throws InterruptedException {

	// Configure the Browser
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	// Step1:launch the browser
	WebDriver driver = new ChromeDriver();

	// Maximize the Browser
	driver.manage().window().maximize();
			
	// Step2:Navigate To Application via URL
	driver.get("https://www.selenium.dev/");
	
	//step3:identify the WE
	WebElement element1 = driver.findElement(By.xpath("//input[contains(@value,'ba')]"));
	
	//fetch the size,location by using RECTANGLE,print on console
	System.out.println("element DIMENSION is :"+element1.getRect().getDimension());
	System.out.println("element LOCATION  is :"+element1.getRect().getPoint());
	System.out.println("element WIDTH  is :"+element1.getRect().getWidth());
	System.out.println("element HEIGHT  is :"+element1.getRect().getHeight());
	System.out.println("element X-Cord is :"+element1.getRect().getX());
	System.out.println("element Y-Cord  is :"+element1.getRect().getY());
	
	
	//close browser
		driver.quit();
}

}
