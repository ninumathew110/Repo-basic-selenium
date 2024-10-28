package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTagName {
	public static void main(String[] args) {
		
	// configure the Browser
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
	// Step1:Launch the Brower
	WebDriver driver = new ChromeDriver();
	
	// Step2:Navigate to the Url
	driver.get("file:///C:/Users/Windows/Downloads/webpage.html");
	
	// Step3:find the Element
	WebElement element1 = driver.findElement(By.xpath("//input[contains(@value,'ba')]"));
	WebElement element2 = driver.findElement(By.xpath("//label[contains(text(),'Bangalore')]"));
	WebElement element3 = driver.findElement(By.xpath("//select[contains(@name,'country')]"));
	WebElement element4 = driver.findElement(By.id("feedback"));	
	
	//Fetch the Tagname
	System.out.println("element1 Tagname---->"+element1.getTagName());
	System.out.println("element2 Tagname---->"+element2.getTagName());
	System.out.println("element3 Tagname---->"+element3.getTagName());
	System.out.println("element4 Tagname---->"+element4.getTagName());
	//Close th eBrowser
	driver.quit();
	
	
	
}


}
