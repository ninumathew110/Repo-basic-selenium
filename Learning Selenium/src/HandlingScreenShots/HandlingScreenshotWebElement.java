package HandlingScreenShots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class HandlingScreenshotWebElement {

	public static void main(String[] args) throws IOException {

		// Launch the Browser
		WebDriver driver = new ChromeDriver();

		// maximize the Browser
		driver.manage().window().maximize();

		// minimize the Browser
		// driver.manage().window().minimize();

		// Wait Statement
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		// Nav to Url
		driver.get("https://www.zomato.com/");

		// identify the WebElement
		WebElement element = driver.findElement(By.xpath("//h2[contains(text(),'Collect')]"));

		// Step2: call the Screenshot Method
		File temp = element.getScreenshotAs(OutputType.FILE);

		// Step3:Create the Permanent Path for Screenshot
		File permanent = new File("./screenshot/webelementshot1.png");

		// Step4:Copy the Screenshot From Temp To Permanent Path
		FileHandler.copy(temp, permanent);

	}

}