package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class performActions {
	public static void main(String[] args) throws InterruptedException {
		// Configure the Browser
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		// Step1:launch the browser
		WebDriver driver = new ChromeDriver();

		// Maximize the Browser
		driver.manage().window().maximize();

		// Step2:Navigate To Application via URL
		driver.get("file:///C:/Users/Windows/Downloads/webpage.html");
		
		Thread.sleep(3000);
		//step3:Identify the WE-NameTxtFld--Action_clear
		WebElement element1=driver.findElement(By.name("name"));
		element1.clear();
		
		Thread.sleep(3000);
		//step3:Identify the WE-NameTxtFld--Action_sendkeys
		WebElement element2=driver.findElement(By.name("email"));
		element2.sendKeys("admin123@gmail.com");
		Thread.sleep(3000);		
		//step3:Identify the WE-manali-checkbox--Action_click
		WebElement element3=driver.findElement(By.id("manali"));
		element3.click();
		
		Thread.sleep(4000);
		//step3:Identify the WE-Register-button--Action_submit
		WebElement element4=driver.findElement(By.xpath("//input[contains(@type,'submit')]"));
		element4.submit();	
		
		//execution completed
		System.out.println("execution completed");
				
		Thread.sleep(4000);
		//close browser
		driver.quit();
}
}