package locators;

import browsers.LaunchBrowser;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ByXpath_Contains extends LaunchBrowser  {
	
	
	@Test
	public void text() throws Exception{
		
		driver.get("https://www.amazon.in");

		driver.findElement(By.xpath("//span[contains(text(),'Hello')]")).click();

		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		try {
			driver.findElement(By.xpath("//a[contains(text(),'Customer Service') and @tabindex=30]")).click();
		}catch (Exception e){
			e.printStackTrace();
		}
		Thread.sleep(2000);
		driver.get("https://www.amazon.com");

		driver.findElement(By.xpath("//span[contains(text(),'Hello')]")).click();
		Thread.sleep(2000);
	}


}
