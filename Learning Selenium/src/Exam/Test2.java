package Exam;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test2 extends baseclass{

	@Test
	public void WEposition() {	
		
		//identify the WE
		WebElement element1 = driver.findElement(By.className("ico-login"));
		
		//fetch the location
		Point location= element1.getLocation();
		
		//print on console
		System.out.println("location of element1 is (X,Y)"+location);
		
		
	}
}
