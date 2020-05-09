package SeleniumFuntions;

import browsers.LaunchChromeWM;
import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilits.BasePage;

import java.io.File;

public class FileUploadDownload extends LaunchChromeWM {


    @Test
    public void test() throws InterruptedException {

        driver.get("http://the-internet.herokuapp.com/");

        WebElement fileUpload = driver.findElement(By.xpath("//a[contains(text(),'File Upload')]"));



        fileUpload.click();

        Thread.sleep(3000);

        String path = System.getProperty("user.dir")+ File.separator+"testng.xml";

        driver.findElement(By.xpath("//*[@id='file-upload']")).sendKeys(path);
        Thread.sleep(3000);
        driver.findElement(By.id("file-submit")).click();

        for(int i=0;i<=1;i++)
            driver.navigate().back();

        Thread.sleep(2000);
        WebElement fileDownload = driver.findElement(By.xpath("//a[contains(text(),'File Download')]"));
        fileDownload.click();

        Thread.sleep(2000);

        driver.findElement(By.linkText("testng.xml")).click();

    }
}
