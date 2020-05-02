package SeleniumFuntions;

import browsers.LaunchChromeWM;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utilits.BasePage;

public class AlertHandling extends LaunchChromeWM {


    @Test
    public void alertHandling() throws InterruptedException {
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        driver.findElement(By.cssSelector("input[name='proceed']")).click();
        Alert alt = driver.switchTo().alert();
        System.out.println("Alert title: "+alt.getText());
        alt.accept();
        Thread.sleep(3000);
        driver.findElement(By.id("login1")).sendKeys("Shilpi");

    }

    @Test(priority = 2)
    public void alertHandling_part2() throws InterruptedException {
        driver.get("http://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        BasePage.acceptAlert(driver);
        String result = driver.findElement(By.id("result")).getText();
        System.out.println(result);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        Thread.sleep(3000);
        BasePage.dismissAlert(driver);

        System.out.println(driver.findElement(By.id("result")).getText());
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        Thread.sleep(3000);
        BasePage.acceptAlertAndSendValue(driver,"Hello all!");

        System.out.println(driver.findElement(By.id("result")).getText());
        Thread.sleep(3000);
    }
}
