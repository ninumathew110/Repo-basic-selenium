package TestngPageRepositoryTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class DemoTest extends Baseclass {

	@Test
	public void Test1() {

		// Identify The Element
		WebElement element = driver.findElement(By.xpath("GOOGLE456"));
		
		//Using @Findby Annotaion.
		//@FindBy(id = "")
		//WebElement element;
		
		// Perform Action--Clear
		element.clear();

		//Incase If The Webpage Got Reloaded/Refreshed
		
		// Perform Action--Enter Data
		element.sendKeys("Harry");
		//We Will Get Exception-StaleElementReffrenceException.

		// Perform Action--Clear
		element.clear();

		// Perform Action--Enter Data
		element.sendKeys("Porter");

	}

}