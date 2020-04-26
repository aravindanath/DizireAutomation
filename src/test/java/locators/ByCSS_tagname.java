package locators;

import browsers.LaunchBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ByCSS_tagname extends LaunchBrowser  {
	
	
	@Test
	public void text() throws Exception{
		
		driver.get("https://www.google.in");


		driver.findElement(By.cssSelector("input[name='q']")).sendKeys("Iphone 11 pro", Keys.ENTER);



	}


}
