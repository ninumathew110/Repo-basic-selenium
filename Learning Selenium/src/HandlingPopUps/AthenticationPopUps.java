package HandlingPopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AthenticationPopUps {

	public static void main(String[] args) throws InterruptedException {

		// Configure the Browser
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		// Step1:launch the browser
		WebDriver driver = new ChromeDriver();

		// Wait Statement
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Maximize the Browser
		driver.manage().window().maximize();

		//Handle The AuthenticationPopups
		String username = "admin";
		String password = "admin@";
		
		//Pass the Customized URL
		//Syntax--->Procol+username+:+password+DomainName
		String url = "https://"+username+":"+password+"the-internet.herokuapp.com/basic_auth";
		
		// Step2:Navigate To Application via URL
		driver.get(url);
		
		Thread.sleep(3000);
		System.out.println("Title Is:"+driver.getTitle());
		
		//Fetch The Sucess Message 
		String message = driver.findElement(By.tagName("p")).getText();
		
		System.out.println(message);

		//Close the Browser
		driver.quit();
		
		

	}

}