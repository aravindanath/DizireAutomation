package locators;

import browsers.LaunchBrowser;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ByXpath_preceeding_axisFunction extends LaunchBrowser  {
	
	
	@Test
	public void text() throws Exception{
		
		driver.get("http://the-internet.herokuapp.com/tables");

		String name ="Tim";

		String web = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr/td[2][contains(text(),'NAME')]//following::td[3]".replace("NAME",name))).getText();

		System.out.println(web);
		//

		String table = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr/td[2][contains(text(),'NAME')]//preceding-sibling::td".replace("NAME",name))).getText();
		System.out.println(table);

		Thread.sleep(5000);

	}


}
