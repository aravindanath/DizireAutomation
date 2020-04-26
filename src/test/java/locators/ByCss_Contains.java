package locators;

import browsers.LaunchBrowser;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ByCss_Contains extends LaunchBrowser  {
	
	
	@Test
	public void text() throws Exception{
		
		driver.get("https://www.amazon.in");

		driver.findElement(By.cssSelector(" input[id*='twotab']")).sendKeys("Iphone Se2");

//		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'twotab')]")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@id,'twotab')]")).sendKeys("Iphone 7");
		Thread.sleep(2000);
	}


}
