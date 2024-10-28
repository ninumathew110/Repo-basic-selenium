package Exam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Test7 extends BaseclassTest7to9 {
	@Test
	public void dropDowns() {
		
		//Navigate to appln
		driver.get("file:///C:/Users/Windows/Downloads/webpage.html");

		//Identify the drop down
		 WebElement dropdown = driver.findElement(By.name("country1"));
	
		//Create an object for select class and pass the drop down reference
		Select selectobj = new Select(dropdown);
		
		//selecting using index
		selectobj.selectByIndex(0);
		
		//Selecting using value
		selectobj.selectByValue("aus");
	
		//Selecting  using visibleText
		selectobj.selectByVisibleText("USA");
}
}