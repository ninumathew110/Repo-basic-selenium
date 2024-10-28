package TestngPageRepositoryTest;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import PageRepository.Homepage;


public class Demotest2 extends Baseclass 
{
	@Test
	public void Test1() {

		//Create an Object For Homepage
		Homepage homepageref = new Homepage(driver);
		
		// Perform Action--Clear
		homepageref.getNametextfield().clear();

		// Incase If The Webpage Got Reloaded/Refreshed

		// Perform Action--Enter Data
		homepageref.getNametextfield().sendKeys("Harry");
		
		// We Will Not Get Exception-StaleElementReffrenceException.
        // Because WE Initialized The Address of WebElemnt 
		
		// Perform Action--Clear
		homepageref.getNametextfield().clear();

		// Perform Action--Enter Data
		homepageref.getNametextfield().sendKeys("Porter");

	}
}