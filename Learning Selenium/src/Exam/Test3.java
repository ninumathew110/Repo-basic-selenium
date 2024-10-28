package Exam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test3 extends baseclass{
	@Test
	public void WEcolor() {
		
		//identify the WE
		WebElement element1 = driver.findElement(By.className("button-1 login-button"));
		
		//fetch the color
		String color=element1.getCssValue("color");
		
		//print on console
		System.out.println("color of WE is :"+color);
		
		
}
}