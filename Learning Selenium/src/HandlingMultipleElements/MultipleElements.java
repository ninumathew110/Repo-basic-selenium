package HandlingMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class MultipleElements {
	public static void main(String[] args) {

	// Configure the Browser
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	// Step1:launch the browser
	WebDriver driver = new ChromeDriver();

	// Maximize the Browser
	// driver.manage().window().maximize();

	// Step2:Navigate To Application via URL
	driver.get("https://www.google.com/");

	// Step3:Identify The WebElement ----Using FindElement
	WebElement Elementlink = driver.findElement(By.tagName("a"));
	String text1 = Elementlink.getText();
	System.out.println(text1);

	// Step4:Identify The WebElements----Using FindElements
	// Identify All the Hyper Link
	List<WebElement> alllink = driver.findElements(By.tagName("a"));

	// Step5:Fetch the Size of List of Hyperlink
	int count = alllink.size();

	// Step6:Print The Count of HyperLink
	System.out.println("Count of Hyper link is: " + count);

	//Step7: print all the Text of HyperLink
	for (int i = 0; i < count; i++) {

		String text = alllink.get(i).getText();
		System.out.println(text);
	}

	driver.quit();

}
	
}