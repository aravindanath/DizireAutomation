package SeleniumFuntions;

import browsers.LaunchChromeWM;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SeleniumBuiltins extends LaunchChromeWM {


    @Test
    public void demo() throws InterruptedException {
        driver.manage().window().fullscreen();
        driver.get("https://www.google.com");

        driver.findElement(By.name("q")).sendKeys("Selenium appium jobs in bagalore", Keys.ENTER);

        String pgTitle =  driver.getTitle();
        System.out.println("Page title--> "+ pgTitle);
        driver.navigate().back();
        Thread.sleep(2000);
        WebElement search = driver.findElement(By.name("q"));
        search.clear();
        search.sendKeys("appium jobs in bagalore", Keys.ENTER);
        Thread.sleep(2000);
        driver.navigate().forward();
        driver.navigate().refresh();
        System.out.println("Page title--> "+ driver.getTitle());


    }


}
