package Exam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test5 extends baseclass{

	@Test
	public void WEpageURL() {
		
		//identify the WE
		WebElement element1 = driver.findElement(By.className("ico-login"));
		element1.click();
		
		//fetch current url
		String url=driver.getCurrentUrl();

		//print url
		System.out.println("Pagecurrent URL is :"+url);
		
}
}
