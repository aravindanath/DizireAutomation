package locators;

import browsers.LaunchBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ByCSS_className extends LaunchBrowser  {
	
	
	@Test
	public void text() throws Exception{
		
		driver.get("https://www.google.in");


		driver.findElement(By.cssSelector(".gLFyf.gsfi")).sendKeys("Iphone 8 ", Keys.ENTER);

		driver.navigate().back();
		driver.findElement(By.cssSelector(".gLFyf")).sendKeys("Iphone 11 pro", Keys.ENTER);
		driver.navigate().back();

		driver.findElement(By.xpath("//*[@class='gLFyf gsfi']")).sendKeys("Iphone 11 ", Keys.ENTER);


	}


}
