package HandlingDropDown;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//verify all the text of options inside the drop down-spelling mistakes

public class HandlingDropDown4 { public static void main(String[] args) {

	// Configure the Browser
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	// Step1:launch the browser
	WebDriver driver = new ChromeDriver();

	// Maximize the Browser
	// driver.manage().window().maximize();

	// Step2:Navigate To Application via URL
	driver.get("file:///C:/Users/USER/eclipse-workspace/Learning_Selenium1/webpage/webpage.html");

	// 1:Identify the Dropdown
	WebElement dropdown1 = driver.findElement(By.name("country1"));
	WebElement dropdown2 = driver.findElement(By.name("country2"));

	// 2:Create an Object For Select Class
	Select selectobj = new Select(dropdown2);

	// Verify all the Text Of Options Inside teh Dropdown

	// Fetch all the Options
	List<WebElement> alloption = selectobj.getOptions();

	// count of options
	System.out.println("Count is :" + alloption.size());

	// Fetch text Of Options
	for (int i = 0; i < alloption.size(); i++) {
		String text = alloption.get(i).getText();
		System.out.println(text);

	}
	System.out.println("-------------------");

	// Alternate Method-->For Fetch All option in single Shot as WE
	WebElement alloptions = selectobj.getWrappedElement();
	System.out.println(alloptions.getText());

	System.out.println("-------------------");
	selectobj.selectByIndex(4);
	selectobj.selectByIndex(3);
	selectobj.selectByIndex(2);

	// Optional Methods
	List<WebElement> allselect = selectobj.getAllSelectedOptions();
	// Fetch text Of Options
	for (int i = 0; i < allselect.size(); i++) {
		String text = allselect.get(i).getText();
		System.out.println(text);

	}
	
	System.out.println("-------------------");
	WebElement fselect = selectobj.getFirstSelectedOption();
	System.out.println(fselect.getText());

}


}

