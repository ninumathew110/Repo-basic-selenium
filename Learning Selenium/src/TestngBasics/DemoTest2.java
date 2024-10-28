package TestngBasics;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest2 {//in case of java,,,method overloading,,need to call each method indiviually

	public static void main(String[] args) {
		System.out.println("Main method 1");
		main();
		main("hello");
		
	}
	
	public static void main() {
		System.out.println("Duplicate main method");
	}
	public static void main(String args) {
		System.out.println("Duplicate main method");
	}
}

