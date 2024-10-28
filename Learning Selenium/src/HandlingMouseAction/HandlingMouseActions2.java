package HandlingMouseAction;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseActions2 {
	public static void main(String[] args) throws InterruptedException {

		// Configure the Browser
				System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

				// Step1:launch the browser
				WebDriver driver = new ChromeDriver();

				// Maximize the Browser
				driver.manage().window().maximize();

				// Waiting Statement-Implicitly Wait
				// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

				// Step2:Navigate To Application via URL
				driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
				
				//Create an Object For ActionsClass
				Actions action = new Actions(driver);
				
				//Identify the Drag Element-Oslo
				WebElement dragelement1 = driver.findElement(By.id("box1"));
				//Identify the Drag Element-Stockholm
				WebElement dragelement2 = driver.findElement(By.id("box2"));
				
			
				//Identify the Drop Element-Norway
				WebElement dropelement1 = driver.findElement(By.id("box101"));
				//Identify the Drop Element-Sweden
				WebElement dropelement2 = driver.findElement(By.id("box102"));
				
				//Perform DragAndDrop Action
				action.dragAndDrop(dragelement1, dropelement1).perform();
				
				//Perform Click and Hold ,Release
				action.clickAndHold(dragelement2).release(dropelement2).perform();
				


}
}