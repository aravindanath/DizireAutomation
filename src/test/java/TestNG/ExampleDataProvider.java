package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExampleDataProvider {
	WebDriver driver;

	@BeforeTest
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.get("https://www.myntra.com/login");
		driver.manage().timeouts().setScriptTimeout(1, TimeUnit.SECONDS);
	}

	@Test(dataProvider = "getData")
	public void loginTest(String user, String password) throws InterruptedException {

		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='email']")).clear();
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(user);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='password']")).clear();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password, Keys.ENTER);

	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[4][2];
		data[0][0] = "aravindnath.dm@myntra.com";
		data[0][1] = "myntra@123";
		data[1][0] = "ankush@myntra.com";
		data[1][1] = "ankush@123";
		data[2][0] = "TEJU@myntra.com";
		data[2][1] = "myntra@123";
		data[3][0] = "sandhya@myntra.com";
		data[3][1] = "myntra#123";
		return data;

	}
	
	@AfterTest
	public void close() {
		
		driver.close();
	}

}
