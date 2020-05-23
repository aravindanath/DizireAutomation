package SeleniumFuntions;

import browsers.LaunchBrowser;
import browsers.LaunchChromeWM;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;
import sun.lwawt.macosx.CSystemTray;
import utilits.BasePage;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class ScreenShotDemo extends LaunchBrowser
{


    @Test
    public void screenshot() throws InterruptedException, IOException {

        driver.get("https://www.amazon.com");


        BasePage.takeScreenShot(driver,"sceenShot");

        driver.get("https://www.myntra.com");
        BasePage.takeFullScreenScreenShot(driver,"full");



    }
}
