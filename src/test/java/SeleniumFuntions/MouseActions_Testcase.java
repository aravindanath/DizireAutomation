package SeleniumFuntions;

import browsers.LaunchChromeWM;
import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilits.BasePage;

import java.util.List;

public class MouseActions_Testcase extends LaunchChromeWM {

    /**
     * Textcase: User should mousehover in women ele and click on dress material and secect 10 dress.
     * @throws InterruptedException
     */

    @Test
    public void test1() throws InterruptedException {
        driver.get("https://www.myntra.com/");
        //

       String title = driver.getTitle();

        WebElement women = driver.findElement(By.xpath("//a[contains(text(),'Women')]"));
        WebElement dressMaterial = driver.findElement(By.xpath("//a[contains(text(),'Dress Materials')]"));

        BasePage.mouseHover(driver,women);
        Thread.sleep(2000);
        BasePage.actionsClick(driver,dressMaterial);
        Thread.sleep(2000);
        WebElement womenRadio = driver.findElement(By.xpath("//input[@type='radio' and @value='women,men women']"));
        BasePage.actionsClick(driver,womenRadio);
        Thread.sleep(2000);
        WebElement inddus = driver.findElement(By.xpath("(//input[@type='checkbox' and @value='Inddus'])[1]"));

        if(!inddus.isSelected()){
            BasePage.actionsClick(driver,inddus);
        }

        Thread.sleep(2000);

        List<WebElement> dress = driver.findElements(By.xpath("//ul[@class='results-base']/li"));
        System.out.println("Total no of dress materials: "+ dress.size());
        dress.get(11).click();

    }





}
