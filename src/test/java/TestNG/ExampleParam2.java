package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExampleParam2 {
	
	WebDriver driver;
	
	@Parameters({"browser"})
	@Test
	public void terstCaseOne(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.out.println("Browser passed is "+browser);
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}else if(browser.equalsIgnoreCase("firefox")) {
			System.out.println("Browser passed is "+browser);
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		driver.get("https://www.google.com");
	}
	
	@Parameters({"user","pass"})
	@Test
	public void terstCaseTwo(String user,String pass) {
		
		System.out.println("User passed is "+user);
		System.out.println("Pass passed is "+pass);
		
	}
	
	
	@AfterTest
	public void close() {
		
		driver.quit();
	}
	

}
