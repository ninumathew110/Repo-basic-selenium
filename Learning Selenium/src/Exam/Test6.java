package Exam;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test6 extends baseclass{
	@Test
	public void AllLinks() {
		
		WebElement elementlink = driver.findElement(By.tagName("a"));
		String textvalue = elementlink.getText();
		System.out.println(textvalue);
		
		//identify complete links
		List<WebElement> entirelinks = driver.findElements(By.tagName("a"));
		
		//fetch the size of list of hyperlinks
		int count=entirelinks.size();
		
		//print the count of hyperLinks
		System.out.println("Count of hyperlinks is:"+count);
		
		//print all the text
		for(int i=0;i<count;i++)
		{
			String text = entirelinks.get(i).getText();
			System.out.println(text);
		}
		
}
}
