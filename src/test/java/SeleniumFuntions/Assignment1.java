package SeleniumFuntions;

import browsers.LaunchChromeWM;
import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilits.BasePage;

import java.util.List;
import java.util.Set;

public class Assignment1 extends LaunchChromeWM {
    String price;
    String fprice;
    @Test
    public void test1() throws InterruptedException {
        driver.manage().window().fullscreen();
        driver.get("https://www.amazon.in/");
        String search = "Apple iPhone XR (128GB)";
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(search, Keys.ENTER);
        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent Window --> "+ parentWindow);
        System.out.println(driver.getTitle());
        List<WebElement> phone = driver.findElements(By.xpath("//div[@class='a-section aok-relative s-image-fixed-height']/img"));
        System.out.println("Total no of Phone "+ phone.size());

        phone.get(2).click();

        Set<String> win = driver.getWindowHandles();

        for(String st : win){
            System.out.println(st);
            driver.switchTo().window(st);
        }

        price = driver.findElement(By.xpath("(//span[contains(text(),'₹')])[1]")).getText();
        System.out.println("Price of XR: "+ price);
        System.out.println(driver.getTitle());

        driver.close();
        driver.switchTo().window(parentWindow);
        WebElement searchTab =  driver.findElement(By.id("twotabsearchtextbox"));
        searchTab.clear();
        searchTab.sendKeys("Moogdal",Keys.ENTER);
        Thread.sleep(2000);

        driver.get("https://www.flipkart.com/");
        driver.findElement(By.xpath("//button[text()='✕']")).click();
        driver.findElement(By.name("q")).sendKeys(search,Keys.ENTER);
        Thread.sleep(2000);
        String win1 = driver.getWindowHandle();
        System.out.println("Parent window id of flipkart "+ win1);
        List<WebElement> fphone = driver.findElements(By.xpath("//div[@class='_1UoZlX']"));
        System.out.println("Total no of Phone "+ fphone.size());

        fphone.get(1).click();

        Set<String> wins = driver.getWindowHandles();
        for(String w : wins){
            System.out.println(w);
            driver.switchTo().window(w);
        }

        fprice = driver.findElement(By.xpath("//div[contains(text(),'₹')][1]")).getText();
        System.err.println("Amazon price for " +search +" --> "+ price);
        System.err.println("Flipkart price for " +search +" --> "+ fprice);
        String finalAPrice;
        finalAPrice = price.replace("₹","").replace(",","").replace(".","").substring(0,6).trim();
        System.out.println(finalAPrice);

        String finalfPrice = fprice.replace("₹","").replace(",","").trim();

        int aPrice = Integer.parseInt(finalAPrice);
        int fPrice = Integer.parseInt(finalfPrice);
        System.out.println("Amazon price: "+finalAPrice );
        System.out.println("Flipkart price: "+finalfPrice );
            if(fPrice>aPrice){

                System.out.println("Flipkart is expencive");
                System.out.println("   Buy on AMAZON.in :)" );

            }else{
                System.out.println("Amazon is cheap!");
            }
    }





}
