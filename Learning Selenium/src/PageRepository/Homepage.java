package PageRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	public Homepage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	// It Will Identify The Element With Latest Address Of Webdriver
	@FindBy(id = "name")
	private WebElement nametextfield;

	public WebElement getNametextfield() {
		return nametextfield;
	}

}