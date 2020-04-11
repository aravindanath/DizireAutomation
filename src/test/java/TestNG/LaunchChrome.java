package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchChrome {
	
	protected WebDriver driver;
	
	@BeforeSuite
	public void report() {
		
		System.out.println("Recording Reports started....");
		
	}
	
	
	
	@BeforeClass
 
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("openBrowser ");
		
	}
	
	
	@AfterClass
 
	public void closeBrowser() {
		
		driver.close();
		
	}

	
	@AfterSuite
	public void Endreport() {
		
		System.out.println("Recording Reports End....");
		
	}
}
