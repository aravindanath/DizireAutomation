package locators;

import browsers.LaunchBrowser;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class ByXpath_MutipleElement extends LaunchBrowser  {
	
	
	@Test
	public void text() throws Exception{
		
		driver.get("https://www.facebook.com");


		List<WebElement> radio = driver.findElements(By.xpath("//input[@type='radio']"));

		System.out.println("Total count of radio"+ radio.size());


		for(WebElement ele : radio){
			if(!ele.isSelected())
			   ele.click();
			Thread.sleep(2000);
		}

		if(!radio.get(0).isSelected())
		radio.get(1).click();



//		driver.findElement(By.xpath("//span[contains(text(),'Hello')]")).click();

		Thread.sleep(2000);

	}


}
