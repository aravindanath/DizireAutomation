package TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Annotations4 extends LaunchChrome {

	@Test
	public void launchAmazon() throws InterruptedException {
		driver.get("https://www.amazon.com");
		Thread.sleep(2000);
		System.out.println("login");
	}

	@Test
	public void search() {

		System.out.println("search");
	}

	@Test
	public void logout() {

		System.out.println("logout");
	}

	 

}
