package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Annotations6 extends LaunchChrome {

	@Test 
	public void launchAmazon() throws InterruptedException {
		driver.get("https://www.google.com");
		Reporter.log("User is on "+ driver.getCurrentUrl());
		Reporter.log("Page title is "+ driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("Selenium jobz",Keys.ENTER);
		Reporter.log("User is on "+ driver.getCurrentUrl());
		Reporter.log("Page title is "+ driver.getTitle());
		Assert.fail("Test fail..");

	}

	 

}
