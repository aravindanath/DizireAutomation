package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import browsers.LaunchBrowser;

public class ByLinkText extends LaunchBrowser  {
	
	
	@Test
	public void text() throws Exception{
		
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Images")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Boston", Keys.ENTER);
		Thread.sleep(2000);
		
	}

}
