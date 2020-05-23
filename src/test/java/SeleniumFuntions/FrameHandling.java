package SeleniumFuntions;

import browsers.LaunchChromeWM;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utilits.BasePage;

public class FrameHandling extends LaunchChromeWM {


    @Test
    public void frameHandling() throws InterruptedException {

        driver.get("https://docs.oracle.com/javase/7/docs/api/");

        driver.switchTo().frame("packageListFrame");
        driver.findElement(By.linkText("java.applet")).click();

        driver.switchTo().defaultContent();
        driver.switchTo().frame("packageFrame");
        Thread.sleep(2000);
        driver.findElement(By.linkText("AudioClip")).click();

        driver.switchTo().defaultContent();
        driver.switchTo().frame("classFrame");

        driver.findElement(By.linkText("loop")).click();

    }
}
