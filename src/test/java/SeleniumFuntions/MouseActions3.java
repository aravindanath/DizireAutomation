package SeleniumFuntions;

import browsers.LaunchChromeWM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilits.BasePage;

public class MouseActions3 extends LaunchChromeWM {

    @Test
    public void test1() throws InterruptedException {
        driver.manage().window().fullscreen();
        driver.get("http://demo.guru99.com/test/drag_drop.html");

        WebElement src = driver.findElement(By.xpath("//*[@id='fourth']/a"));



        BasePage.rightClick(driver,src);

    }





}
