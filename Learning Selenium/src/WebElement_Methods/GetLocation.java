package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {
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
	WebElement element2 = driver.findElement(By.xpath("//p[contains(@class,'fw-normal')]"));
	
	//step4: fetch the size of element
	Point location1= element1.getLocation();
	Point location2= element2.getLocation();
	
	//print on console
	System.out.println("location of element1 is (X,Y)"+location1);
	System.out.println("location of element2 is (X,Y)"+location2);

	
	//close browser
		driver.quit();
}
	

}
