package HandlingMultipleElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAutoSuggestion {	
//scenario:Identify all the suggestions in the search box after entering the search box
	public static void main(String[] args) {
	// Configure the Browser
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	// Step1:launch the browser
	WebDriver driver = new ChromeDriver();

	// Maximize the Browser
	driver.manage().window().maximize();

	// Step2:Navigate To Application via URL
	driver.get("https://www.google.com/");

	//wait statement
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	//step3:identify the WE--->using findElement
	WebElement element=driver.findElement(By.name("q"));
	
	//step4:enter the search data on the search box
	element.sendKeys(("selenium"));
	
	//step5:fetch all the dynamic suggestion and store it
	List<WebElement> allsuggestion = driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
	
	//step6:count all the suggestions
	int count = allsuggestion.size();
	System.out.println("count of autosuggestion is:"+count);
	
	//step7:print all the suggestions
	for(int i=0;i<count;i++)
	{
		String text =allsuggestion.get(i).getText();
		System.out.println(i+1+" : "+text);
	}
	
	//close browser
	driver.quit();
	
}

}