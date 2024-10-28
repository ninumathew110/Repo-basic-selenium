package Testing;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) 
	{
		String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		
		//configure the browser/setup
		System.setProperty(null, null);
		
		//step1:launch the Browser-Chrome
		new ChromeDriver();
	}

}
