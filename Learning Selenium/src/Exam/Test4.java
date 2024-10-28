package Exam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test4 extends baseclass  {
	@Test
	public void WEtextboxValue() {
		
		//identify the WE
		WebElement element1 = driver.findElement(By.id("small-searchterms"));
		element1.sendKeys("I have written script");

		String Expectedtext= "I have written script";
		String Actualtext= element1.getText();
		
		if (Expectedtext.equals(Actualtext))
		{
			System.out.println("testpass");
		}	
			else
			{
				System.out.println("Testfail");
		}
		
		//print on console
		System.out.println("Text Value is"+Actualtext);
		
	}
}
