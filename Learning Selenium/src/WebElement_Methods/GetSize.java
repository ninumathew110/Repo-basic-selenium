package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {
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
	Dimension size1= element1.getSize();
	Dimension size2= element2.getSize();
	
	//print on console
	System.out.println("element size1 is (width,height)"+size1);
	System.out.println("element size2 is (width,height)"+size2);

	
	//close browser
		driver.quit();
}
}