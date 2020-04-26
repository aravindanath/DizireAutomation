package locators;

import browsers.LaunchBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ByCSS_id extends LaunchBrowser  {
	
	
	@Test
	public void text() throws Exception{
		
		driver.get("https://www.amazon.in");

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 11 pro", Keys.ENTER);
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("Iphone 11 pro", Keys.ENTER);
		driver.navigate().back();
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Iphone 11 pro", Keys.ENTER);

	}


}
