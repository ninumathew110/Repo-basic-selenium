package Exam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Test9 extends BaseclassTest7to9{
	@Test
	public void WEtextboxValue() {
		
		//identify the WE
		WebElement element1 = driver.findElement(By.id("feedback"));
		element1.sendKeys("Selenium final Mock-M26");

		
	}
}


