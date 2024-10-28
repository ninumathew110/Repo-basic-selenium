package Testing;// MY OWN PROGRAM
import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingMultipleBrowser {
	public static void main(String[] args) 
	{
		//IT IS ACCESS KEY FOR THE EXECUTABLE FILES
		String key1="webdriver.chrome.driver";
		String key2="webdriver.edge.driver";
		String key3="webdriver.gekco.driver";
		
		//Its a path of the driverExecutable file
		String value1="./driver/chromedriver.exe";
		String value2="./driver/msedgedriver.exe";
		String value3="./driver/gekcodriver.exe";
		
		//configure the browser/setup
		System.setProperty(key1, value1);
		System.setProperty(key2, value2);
		System.setProperty(key3, value3);
		
		//create object ref of webdriver type
		WebDriver driver;
		
		Scanner sc=new Scanner(System.in);
		boolean exit=true;
		while(exit)
		{
			System.out.println("\n1.chrome \n2.edge \n3.firefox \n4.EXIT");		
			int choice=sc.nextInt();
				
			switch(choice)
			{
//------------------------------------------------------------------------------------
		
		case 1:
		{
	
		//if user gives browsername="chrome"
		
		//step1:launch the Browser-Chrome
		driver=new ChromeDriver();
		
		//step2:Navigate to the Application via URL
		
		driver.get("https://www.swiggy.com/");
		}
		break;
//-------------------------------------------------------------------------------------		
		case 2:
		{
			//if user gives browsername="edge"
		
		//step1:launch the Browser-Edge
		 driver=new EdgeDriver();
				
			//step2:Navigate to the Application via URL
				driver.get("https://www.zomato.com/");
		}
		break;
//-------------------------------------------------------------------------------------
		case 3:
		{
			//if user gives browsername="firefox"
		
				//step1:launch the Browser-firefox
				 driver=new FirefoxDriver();
				
				//step2:Navigate to the Application via URL
				driver.get("https://www.selenium.dev/");
		}
			break;	
//-----------------------------------------------------------------------------------------------
		case 4:
		
		{
			exit=false;
			System.out.println("THANK YOU!!!!!!!!!!!");
		}
			break;
			
		default:System.out.println("Invalid choice");
		
			}//switch closed
		}//while closed
	}
}
