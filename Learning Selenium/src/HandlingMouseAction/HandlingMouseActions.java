package HandlingMouseAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//
public class HandlingMouseActions {//wrong recheck again
	public static void main(String[] args) throws InterruptedException {

	//configure the browser/setup
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	//step1:launch the Browser-Chrome
	WebDriver driver=new ChromeDriver();	
	
	//Maximize the browser  
	driver.manage().window().maximize();//using method chaining we are calling diff methods here
	
	//waiting statement-implicit wait
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	//step2:Navigate to appln via URL
	driver.get("https://demowebshop.tricentis.com/");
	
	//step3: Create an object for actions class
	Actions action = new Actions(driver);
	
	//Step4:Identify the element
	WebElement element1 = driver.findElement(By.xpath("//ul[@class='top-menu']//a[contains(text(),'Computers')]"));
	WebElement element2 = driver.findElement(By.partialLinkText("Register"));
	
	Thread.sleep(3000);
	//step5:Perform mouse Hovering:
	action.moveToElement(element1).perform();
	
	//Thread.sleep(3000);
	//step6:Perform double mouse actions :
	//action.moveToElement(element2).click().perform();
		
	Thread.sleep(3000);
	//perform click action
	action.click(driver.findElement(By.partialLinkText("Register"))).perform();
	
	Thread.sleep(3000);
	//perform double click action
	action.doubleClick(driver.findElement(By.xpath("Log in"))).perform();
	
	Thread.sleep(3000);
	//perform right click action
	action.contextClick(driver.findElement(By.xpath("Shopping cart"))).perform();

	//execution complete message
	System.out.println("Execution completed");
	
	}
}
