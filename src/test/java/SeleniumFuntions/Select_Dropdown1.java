package SeleniumFuntions;

import browsers.LaunchChromeWM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Select_Dropdown1  extends LaunchChromeWM {


    @Test
    public void test() throws InterruptedException {

        driver.get("https://www.wikipedia.org/");

        WebElement lang = driver.findElement(By.xpath("//select[@id='searchLanguage']"));

        Select sel = new Select(lang);

        sel.selectByIndex(10);
        Thread.sleep(3000);
        sel.selectByValue("he");
        Thread.sleep(3000);
        sel.selectByVisibleText("தமிழ்");










    }
}
