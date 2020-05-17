package assignment;

import browsers.LaunchChromeWM;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilits.BasePage;

import java.util.ArrayList;
import java.util.Set;

public class TripAdvisor extends LaunchChromeWM {


    @Test
    public void test() throws InterruptedException {

        driver.get("https://www.tripadvisor.in/");
        System.out.println("Page Title"+ driver.getTitle());
        driver.findElement(By.xpath("(//input[@type='search'])[2]")).sendKeys("club mahindra", Keys.ENTER);

        Thread.sleep(2000);
        String win1 = driver.getWindowHandle();
        driver.findElement(By.xpath("(//div[@class='ui_columns is-multiline is-mobile'])[1]/div[1]")).click();

        Set<String> win = driver.getWindowHandles();
        for (String w : win){
            System.out.println(w);
            driver.switchTo().window(w);

        }
        System.out.println("Page Title"+ driver.getTitle());
        WebElement review = driver.findElement(By.xpath("//a[text()='Write a review']"));
        BasePage.scrollTillElement(driver,review);
        Thread.sleep(2000);
        WebElement review2 = driver.findElement(By.xpath("//a[text()='Write a review']"));
        review2.click();

        ArrayList<String> windows = new ArrayList<String>(driver.getWindowHandles());
        System.out.println(windows.size());
         for(String w : windows){
             driver.switchTo().window(w);
        }
        Thread.sleep(2000);
        System.out.println("Page Title"+ driver.getTitle());

        WebElement rate = driver.findElement(By.xpath("//img[contains(@alt,'Roll over, then click to rate')]"));
        BasePage.mouseHoverAndClick(driver,rate);
        Thread.sleep(2000);



    }
}
