package locators;

import browsers.LaunchBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ByXpath_Relative extends LaunchBrowser  {
	
	
	@Test
	public void text() throws Exception{
		
		driver.get("https://www.google.com");

		driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div/div/div/div[2]/input")).sendKeys("Selenium Jobs",Keys.ENTER);





	}

}
