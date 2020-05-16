package SeleniumFuntions;

import browsers.LaunchChromeWM;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilits.BasePage;

import java.util.List;

public class AutoSuggestCalander extends LaunchChromeWM {

    @Test
    public void test1() throws InterruptedException {
        driver.get("https://www.redbus.in/");
        driver.manage().window().fullscreen();
        driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Ban");
        Thread.sleep(2000); //
        // This returns list of cities / pickup points
        List<WebElement> src = driver.findElements(By.xpath("//ul[@class='autoFill']/li"));
        System.out.println("Total no of pickup / cities :" + src.size());

        for(WebElement ele : src){
           // System.out.println(ele.getText());
            if(ele.getText().equals("Tin Factory, Bangalore")){
                ele.click();
                break;
            }
        }
        Thread.sleep(2000);

        driver.findElement(By.id("dest")).sendKeys("Hyd");
        Thread.sleep(2000);
        List<WebElement> dest = driver.findElements(By.xpath("//ul[@class='autoFill']/li"));
        System.out.println("Total no of Drop / cities :" + src.size());

        for(WebElement ele : dest){
            System.out.println(ele.getText());
            if(ele.getText().equals("Bhel, Hyderabad")){
                ele.click();
                break;
            }
        }
        Thread.sleep(2000);

        driver.findElement(By.cssSelector(".fl.icon-calendar_icon-new.icon-onward-calendar.icon")).click();

        Thread.sleep(1000);

       List<WebElement> onWardCal = driver.findElements(By.xpath("(//table[@class='rb-monthTable first last'])[1]/tbody/tr/td"));
        Thread.sleep(1000);
       for(WebElement ele : onWardCal){
           if(!ele.getText().equals("Jun 2020")){
               driver.findElement(By.xpath("(//button[text()='>'])[2]")).click();
               break;
           }
       }

        List<WebElement> onward1 = driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']/table/tbody/tr/td"));
        for(WebElement ele : onward1){
            if(ele.getText().equals("9")){
                ele.click();
                break;
            }
        }

        Thread.sleep(2000);


        driver.findElement(By.cssSelector(".fl.icon-calendar_icon-new.icon-return-calendar.icon")).click();

        List<WebElement> returnDate = driver.findElements(By.xpath("//div[@id='rb-calendar_return_cal']/table/tbody/tr/td"));
        for(WebElement ele : returnDate){
            if(ele.getText().equals("17")){
                ele.click();
                break;
            }
        }

        Thread.sleep(2000);

        driver.findElement(By.cssSelector("#search_btn")).click();

        Thread.sleep(2000);

        WebElement notification =  driver.findElement(By.xpath("//div[text()='VIEW SAFETY+ BUSES']"));
        BasePage.jsClick(driver,notification);

        Thread.sleep(2000);

        WebElement aminites = driver.findElement(By.xpath("//div[text()='AMENITIES']"));

        BasePage.scrollTillElement(driver,aminites);
        BasePage.highlightElement(driver,aminites,"red");
        Thread.sleep(2000);


//        try {
//            driver.findElement(By.xpath("(//div[@class='close'])[1]")).click();
//            Thread.sleep(1000);
//            driver.findElement(By.xpath("//span[text()='Ok, got it']")).click();
//        } catch (Exception e){
//            System.out.println("Your safety is our utmost priority did not appear");
//        }

    }





}
