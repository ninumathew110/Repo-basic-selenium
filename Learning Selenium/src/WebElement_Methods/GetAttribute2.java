package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute2 {
	public static void main(String[] args) throws InterruptedException {
		// configure the Browser
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		// Step1:Launch the Brower
		WebDriver driver = new ChromeDriver();
		
		// Step2:Navigate to the Url
		driver.get("file:///C:/Users/Windows/Downloads/webpage.html");
		
		
		// step3:fInd the element
		WebElement element = driver.findElement(By.xpath("//input[contains(@value,'bangalore')]"));
		
		// Verify the element
		//boolean vfelement = element.isDisplayed();
		
		Thread.sleep(3000);
		if (element.isDisplayed()) {
			System.out.println("TEst PAssed: element is Displayed");

		} else {
			System.out.println("TEst FAiled: element is Not  Displayed");

		}
		Thread.sleep(3000);
		// step4:fetch the Attribute
		String eleID = element.getAttribute("id");
		String elename = element.getAttribute("name");
		String eletype = element.getAttribute("type");
		String elevalue = element.getAttribute("value");
		
		Thread.sleep(3000);
		// step5:Print the Text on the Console
		System.out.println("ELEMENT Id IS =" + eleID);
		System.out.println("ELEMENT name IS =" + elename);
		System.out.println("ELEMENT type IS =" + eletype);
		System.out.println("ELEMENT value IS= " + elevalue);

		// Close the Browser
		driver.quit();
	}

}