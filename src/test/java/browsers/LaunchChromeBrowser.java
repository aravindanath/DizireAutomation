package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class LaunchChromeBrowser {
	
	protected WebDriver driver;
	
	@BeforeClass
	public void openBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/aravindanathdm/Documents/driver/chromedriver");
		driver = new ChromeDriver();
		
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
