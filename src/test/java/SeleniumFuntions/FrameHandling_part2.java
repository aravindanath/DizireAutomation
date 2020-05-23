package SeleniumFuntions;

import browsers.LaunchChromeWM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FrameHandling_part2 extends LaunchChromeWM {


    @Test
    public void frameHandling() throws InterruptedException {

        driver.get("http://the-internet.herokuapp.com/iframe");


        driver.switchTo().frame("mce_0_ifr");
       Thread.sleep(2000);
       WebElement ele = driver.findElement(By.cssSelector("#tinymce"));
       ele.clear();
       ele.sendKeys("Hello we learnt frame handling!");



    }
}
