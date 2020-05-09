package SeleniumFuntions;

import browsers.LaunchChromeWM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MouseActions1  extends LaunchChromeWM {

    @Test
    public void test1() throws InterruptedException {
        driver.get("https://www.myntra.com/");
        //

       String title = driver.getTitle();

        Assert.assertEquals(title,"Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra");

        WebElement women = driver.findElement(By.xpath("//a[contains(text(),'Women')]"));
        WebElement dressMaterial = driver.findElement(By.xpath("//a[contains(text(),'Dress Materials')]"));


        Actions act = new Actions(driver);
        act.moveToElement(women).build().perform();
        Thread.sleep(3000);
        act.click(dressMaterial).build().perform();



    }





}
