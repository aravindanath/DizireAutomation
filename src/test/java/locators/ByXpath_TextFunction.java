package locators;

import browsers.LaunchBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ByXpath_TextFunction extends LaunchBrowser  {
	
	
	@Test
	public void text() throws Exception{
		
		driver.get("https://www.amazon.in");

		driver.findElement(By.xpath("//span[text()='Hello. Sign in' or text()='Hello, Sign in' ]")).click();

		Thread.sleep(2000);

		driver.get("https://www.amazon.com");

		driver.findElement(By.xpath("//span[text()='Hello. Sign in' or text()='Hello, Sign in' ]")).click();
		Thread.sleep(2000);
	}

}
