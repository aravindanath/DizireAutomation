package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchChromeWM {
	
	protected WebDriver driver;
	String browser = "chrome";
	@BeforeClass
	public void openBrowser() {
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-notifications");
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(ops);
		}else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
	}
	

	
	@AfterClass
	public void close() throws InterruptedException {

		Thread.sleep(5000);
		driver.quit();
	}

}
