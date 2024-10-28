package HandlingPopUps;

import java.io.File;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingFilePopUps {

	public static void main(String[] args) {

		// Configure the Browser
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		// Step1:launch the browser
		WebDriver driver = new ChromeDriver();

		// Maximize the Browser
		// driver.manage().window().maximize();

		// Step2:Navigate To Application via URL
		driver.get("file:///C:/Users/Windows/Downloads/webpage.html");

		//Handle the FileUpload Popups
		
		//Identify The Element Which Generates the Popups
		WebElement element = driver.findElement(By.xpath("//input[@type='file']"));
		
		//1.Create An Object For File Class
		File fileTOupload = new File("./data/NINU RESUME-2024.docx");
		
		//2.Get The Actual Path
		String FilePath = fileTOupload.getAbsolutePath();
		
		//3.Pass the File Using SendKeys
		element.sendKeys(FilePath);
		
		
	
		
		
	}

}

