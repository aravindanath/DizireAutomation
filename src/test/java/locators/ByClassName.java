package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import browsers.LaunchBrowser;

public class ByClassName  extends LaunchBrowser  {
	
	
	@Test
	public void text() throws Exception{
		
		driver.get("https://www.icicibank.com");
		Thread.sleep(2000);
		driver.findElement(By.className("pl-login-ornage-box")).click();
		Thread.sleep(2000);
		
	}

}
