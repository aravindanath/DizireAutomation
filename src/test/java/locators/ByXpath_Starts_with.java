package locators;

import browsers.LaunchBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class ByXpath_Starts_with extends LaunchBrowser  {
	
	
	@Test
	public void text() throws Exception{
		
		driver.get("https://www.google.com");

		driver.findElement(By.xpath("//input[starts-with(@class,'gLF')]")).sendKeys("Rest assured job in bangalore", Keys.ENTER);

		Thread.sleep(5000);

	}


}
