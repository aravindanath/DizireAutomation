package locators;

import browsers.LaunchBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class ByTag_multiple extends LaunchBrowser  {
	
	
	@Test
	public void text() throws Exception{
		
		driver.get("https://www.google.com");

		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println("Total no of links: "+ links.size());

		for(WebElement ele : links){

			if(ele.getText().equalsIgnoreCase("Stay home to thank those who are helping us")){
					ele.click();
					break;
			}


		}

		driver.navigate().back();
		Thread.sleep(2000);

		List<WebElement> links2 = driver.findElements(By.tagName("a"));

		links.get(2).click();
		Thread.sleep(2000);

	}

}
