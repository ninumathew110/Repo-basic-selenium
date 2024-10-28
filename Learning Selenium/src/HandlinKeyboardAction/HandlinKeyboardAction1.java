package HandlinKeyboardAction;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class HandlinKeyboardAction1 {
	
	public static void main(String[] args) throws AWTException {

		// Configure the Browser
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		// Step1:launch the browser
		WebDriver driver = new ChromeDriver();

		// Maximize the Browser
		driver.manage().window().maximize();

		// Waiting Statement-Implicitly Wait
		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Step2:Navigate To Application via URL
		driver.get("https://www.google.com/");

		// To Perfom Keyboard Action

		// Using Robot Class
		Robot robotobj1 = new Robot();

		// Identify the Seachh Text-Box
		driver.findElement(By.name("q")).click();

		// Perform Keyboard Action-->KeyPressing
		robotobj1.keyPress(KeyEvent.VK_S);

		// Perform Keyboard Action-->KeyRealse
		robotobj1.keyRelease(KeyEvent.VK_S);

		// Perform Keyboard Action-->KeyPressing
		robotobj1.keyPress(KeyEvent.VK_E);

		// Perform Keyboard Action-->KeyRealse
		robotobj1.keyRelease(KeyEvent.VK_E);

		// Perform Keyboard Action-->KeyPressing
		robotobj1.keyPress(KeyEvent.VK_L);

		// Perform Keyboard Action-->KeyRealse
		robotobj1.keyRelease(KeyEvent.VK_L);

		// Perform Keyboard Action-->KeyPressing
		robotobj1.keyPress(KeyEvent.VK_E);

		// Perform Keyboard Action-->KeyRealse
		robotobj1.keyRelease(KeyEvent.VK_E);

		// Perform Keyboard Action-->KeyPressing
		robotobj1.keyPress(KeyEvent.VK_N);

		// Perform Keyboard Action-->KeyRealse
		robotobj1.keyRelease(KeyEvent.VK_N);

		// Perform Keyboard Action-->KeyPressing
		robotobj1.keyPress(KeyEvent.VK_I);

		// Perform Keyboard Action-->KeyRealse
		robotobj1.keyRelease(KeyEvent.VK_I);

		// Perform Keyboard Action-->KeyPressing
		robotobj1.keyPress(KeyEvent.VK_U);

		// Perform Keyboard Action-->KeyRealse
		robotobj1.keyRelease(KeyEvent.VK_U);

		// Perform Keyboard Action-->KeyPressing
		robotobj1.keyPress(KeyEvent.VK_M);

		// Perform Keyboard Action-->KeyRealse
		robotobj1.keyRelease(KeyEvent.VK_M);

			}
}