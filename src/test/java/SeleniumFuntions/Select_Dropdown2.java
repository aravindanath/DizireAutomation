package SeleniumFuntions;

import browsers.LaunchChromeWM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import utilits.BasePage;

public class Select_Dropdown2 extends LaunchChromeWM {


    @Test
    public void test() throws InterruptedException {

        driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");

        WebElement city = driver.findElement(By.xpath("//select[@id='multi-select']"));

        BasePage.selectByIndex(city,1);
        BasePage.selectByValue(city,"Ohio");
        BasePage.selectByVisible(city,"New York");
        Thread.sleep(3000);

        BasePage.deselectAllValue(city);


        for(int i=1;i<8;i++){
            BasePage.selectByIndex(city,i);
        }

        Thread.sleep(3000);

        for(int i=7;i>1;i--){
            BasePage.deselectByIndex(city,i);
        }






    }
}
