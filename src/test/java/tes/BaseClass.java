package tes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	public static WebDriver driver;
	
	String url = "https://www.facebook.com/";
			
	@BeforeTest
	public void setup() {
		
		// Open Browser
		driver = new ChromeDriver();
		
		driver.get(url);
	}
	
	@AfterTest
	public void tearDown() {
		
		// Close Browser
		driver.close();
		
	}
	
}
