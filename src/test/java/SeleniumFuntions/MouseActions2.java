package SeleniumFuntions;

import browsers.LaunchChromeWM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilits.BasePage;

public class MouseActions2 extends LaunchChromeWM {

    @Test
    public void test1() throws InterruptedException {
        driver.manage().window().fullscreen();
        driver.get("http://demo.guru99.com/test/drag_drop.html");

        WebElement src = driver.findElement(By.xpath("//*[@id='fourth']/a"));

        WebElement trg = driver.findElement(By.xpath("//*[@id='amt7']/li"));

        BasePage.dragAndDrop(driver,src,trg);

    }





}
