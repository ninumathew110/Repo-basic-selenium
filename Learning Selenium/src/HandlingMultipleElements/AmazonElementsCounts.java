package HandlingMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonElementsCounts {
	public static void main(String[] args) {
	// Configure the Browser
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	// Step1:launch the browser
	WebDriver driver = new ChromeDriver();

	// Maximize the Browser
	driver.manage().window().maximize();

	// Step2:Navigate To Application via URL
	driver.get("https://www.amazon.in/");
	
	//step3:Identify the WebElement findElement
	WebElement elementlink = driver.findElement(By.tagName("a"));
	String text = elementlink.getText();
	System.out.println(text);
	
	//steps4:identify the webElements--->Using FindElements
	//identify all the hyper link
	List<WebElement> alllink = driver.findElements(By.tagName("a"));
	
	//step5:fetch the size of list of hyperlinks
	int count=alllink.size();
	
	//print the count of hyperLinks
	System.out.println("Count of hyperlinks is:"+count);
	
	//print all the text
	for(int i=0;i<count;i++)
	{
		String text1 = alllink.get(i).getText();
		System.out.println(text1);
	}
	//close browser
	driver.quit();
}

}
