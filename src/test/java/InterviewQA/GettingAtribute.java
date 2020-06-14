package InterviewQA;

import browsers.LaunchChromeWM;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilits.BasePage;

public class GettingAtribute extends LaunchChromeWM {


    @Test
    public void getAtribute() throws InterruptedException {

        driver.get("https://www.amazon.in/");

        String value = driver.findElement(By.id("twotabsearchtextbox")).getAttribute("dir");
        System.out.println(value);

        if(value.equals("auto")){System.out.println("Value is AUTO");
        }
//        WebElement sub = driver.findElement(By.cssSelector("#basic-usage"));
//         BasePage.scrollTillElement(driver,sub);
//        Thread.sleep(5000);
//       String value = driver.findElement(By.xpath("//*[@id='subcat-id']")).getAttribute("disabled");
//       System.out.println(value);
//        WebElement dd = driver.findElement(By.cssSelector("#cat-id"));
//       if(value.equals(true)){
//           System.out.println("Element is diabled");
//          BasePage.selectByIndex(dd,2);
//       }
//        Thread.sleep(5000);
    }
}
