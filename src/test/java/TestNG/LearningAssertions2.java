package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utilits.BasePage;

public class LearningAssertions2  extends LaunchChrome{
	
	
	@Test 
	public void assertionDemo() throws InterruptedException {
		driver.get("https://www.Google.com");
		
		String title = driver.getTitle();// Actual title
//		BasePage.assertTitle(title, "Facebook – log in or sign up");
//		SoftAssert sf = new SoftAssert();
//		sf.assertEquals(title, "Facebook");
		BasePage.sfassertTitle(title, "Facebook");
		
		
		System.out.println("Page title is "+ title );
		driver.findElement(By.name("q")).sendKeys("Selenium jobz",Keys.ENTER);
		
		Thread.sleep(5000);
//		sf.assertAll();
	 
		
		
		 
		
		
	}

}
