package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchChromeWM {
	
	protected WebDriver driver;
	String browser = "chrome";
	@BeforeClass
	public void openBrowser() {
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();	
		}else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
	}
	
	@Test
	public void demo() {
		driver.get("https://www.google.com");
	}
	
	
	@AfterClass
	public void close() {
		driver.close();
	}

}
