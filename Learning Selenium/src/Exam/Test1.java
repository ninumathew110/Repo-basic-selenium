package Exam;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import TestngBatchExecution.BaseClass;

public class Test1 extends baseclass{
	@Test
	public void WEsize() {
	
	//identify the WE
	WebElement element1= driver.findElement(By.className("ico-login"));
	
	//fetch the rectangle
	Rectangle rect=element1.getRect();
	
	//print on console
	System.out.println("elementwidth is :"+rect.getWidth());
	System.out.println("elementheight is :"+rect.getHeight());
	System.out.println("element X-Co is :"+rect.getX());
	System.out.println("element Y-Co  is :"+rect.getY());
	
	
	}
		
		
		}
		
		
		

