package WebElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValue {//Wrong re-check program
	public static void main(String[] args) throws InterruptedException {
	
	// Configure the Browser
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	// Step1:launch the browser
	WebDriver driver = new ChromeDriver();

	// Maximize the Browser
	driver.manage().window().maximize();
			
	// Step2:Navigate To Application via URL
	driver.get("https://www.selenium.dev/");
	
	//step3:identify the WE
	WebElement element1 = driver.findElement(By.xpath("//h1[contains(@class,fw-bold)]"));

	Thread.sleep(2000);
	//step4 fetch the css value
	String color_Css = element1.getCssValue("background-color");
	String textalign_Css = element1.getCssValue("Text_align");
	String boxsizing_css=element1.getCssValue("box_sizing");
	String lineheight_css=element1.getCssValue("color");
	
	//step5 print on console
	System.out.println("color_Css value is :"+color_Css);
	System.out.println("textalign_Css value is :"+textalign_Css);
	System.out.println("boxsizing_css value is :"+boxsizing_css);
	System.out.println("lineheight_css value is :"+lineheight_css);
	
	//close browser
	driver.quit();
	}
}
