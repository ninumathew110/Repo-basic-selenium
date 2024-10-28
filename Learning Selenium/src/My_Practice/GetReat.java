package My_Practice;//wrong

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetReat {
	public static void main(String[] args) throws InterruptedException {

	// Configure the Browser
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	// Step1:launch the browser
	WebDriver driver = new ChromeDriver();

	// Maximize the Browser
	driver.manage().window().maximize();
			
	// Step2:Navigate To Application via URL
	driver.get("https://www.shoppersstack.com/");
	
	//step3:identify the WE
	WebElement element1 = driver.findElement(By.xpath("//a[contains(@id,'women')]"));
	WebElement element2 = driver.findElement(By.xpath("//a[contains(@id,'cart')]"));
	
	//fetch the size,location by using RECTANGLE,print on console
	System.out.println("element DIMENSION is :"+element1.getRect().getDimension());
	System.out.println("element LOCATION  is :"+element1.getRect().getPoint());
	System.out.println("element WIDTH  is :"+element1.getRect().getWidth());
	System.out.println("element HEIGHT  is :"+element1.getRect().getHeight());
	System.out.println("element X-Cord is :"+element1.getRect().getX());
	System.out.println("element Y-Cord  is :"+element1.getRect().getY());
	
	System.out.println("element DIMENSION is :"+element2.getRect().getDimension());
	System.out.println("element LOCATION  is :"+element2.getRect().getPoint());
	System.out.println("element WIDTH  is :"+element2.getRect().getWidth());
	System.out.println("element HEIGHT  is :"+element2.getRect().getHeight());
	System.out.println("element X-Cord is :"+element2.getRect().getX());
	System.out.println("element Y-Cord  is :"+element2.getRect().getY());
	
	
	//close browser
		driver.quit();
}


}
