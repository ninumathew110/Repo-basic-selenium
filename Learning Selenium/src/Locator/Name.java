package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name {

	public static void main(String[] args) throws InterruptedException  {
			// Configure the Browser
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

			// Step1:launch the browser
			WebDriver driver = new ChromeDriver();

			// Maximize the Browser
			driver.manage().window().maximize();

			// Step2:Navigate To Application via URL
			driver.get("file:///C:/Users/Windows/Downloads/webpage.html");
			
			// Step3:Identify The WebElement-NameTxtfld using name Locator
			// and Perform Clear Action
			driver.findElement(By.name("name")).clear();

			// Step4:Identify the WebElement-emailTxtFld using  name Locator
			// and perform Sendkeys action
			driver.findElement(By.name("email")).sendKeys("admin123@gmail.com");

			// Step5:identify the webelement-Goa-Checkbox using name Locator
			// and perform Click Action
			driver.findElement(By.name("places")).click();

			// Step6:Close the Browser
			// driver.close();

			// Execution Completed
			System.out.println("Execution Completed");
				

			}

	}


