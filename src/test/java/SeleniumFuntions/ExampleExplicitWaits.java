package SeleniumFuntions;

import browsers.LaunchBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import utilits.BasePage;

import java.security.Key;

public class ExampleExplicitWaits extends LaunchBrowser {

//https://www.browserstack.com/guide/wait-commands-in-selenium-webdriver
    @Test
    public void explicitWati() throws InterruptedException {

       driver.get("https://www.expedia.co.in/");

       driver.findElement(By.cssSelector("#tab-flight-tab-hp")).click();
        WebElement ele =driver.findElement(By.xpath("//span[text()='One way']"));
        BasePage.jsClick(driver,ele);
        driver.findElement(By.xpath("(//div[@class='input-btn-group']/label/input)[1]")).sendKeys("Bengaluru (BLR-Kempegowda Intl.)", Keys.ENTER);
        driver.findElement(By.xpath("(//div[@class='input-btn-group']/label/input)[2]")).sendKeys("Boston, MA (BOS-Logan Intl.)", Keys.ENTER);
        driver.findElement(By.cssSelector("#flight-departing-single-hp-flight")).sendKeys("20/08/2020",Keys.ENTER);
        WebElement sel = driver.findElement(By.xpath("(//span[text()='Select'])[1]"));
        WebDriverWait wait = new WebDriverWait(driver,40);
        wait.until(ExpectedConditions.elementToBeClickable(sel));
        BasePage.jsClick(driver,sel);

    }








}
