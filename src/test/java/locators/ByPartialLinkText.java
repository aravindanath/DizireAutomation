package locators;

import browsers.LaunchBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ByPartialLinkText extends LaunchBrowser  {
	
	
	@Test
	public void text() throws Exception{
		
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Imag")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Boston in carona", Keys.ENTER);
		Thread.sleep(2000);
		
	}

}
