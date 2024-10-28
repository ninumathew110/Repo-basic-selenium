package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRect {
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
	WebElement element1 = driver.findElement(By.xpath("//h1[contains(@class,fw-bold)]"));
	
	//step4:fetch the rectangle
	Rectangle rect=element1.getRect();
	
	//print on console
	System.out.println("element width is :"+rect.getWidth());
	System.out.println("element height  is :"+rect.getHeight());
	System.out.println("element X-Cord is :"+rect.getX());
	System.out.println("element Y-Cord  is :"+rect.getY());
	
	//close browser
		driver.quit();
}

}
