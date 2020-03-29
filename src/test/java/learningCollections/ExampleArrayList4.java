package learningCollections;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExampleArrayList4 {


    @Test
    public void dropdown() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

       List<WebElement> links = driver.findElements(By.xpath("//a"));

       System.out.println("Total no of links: "+links.size());


       for(WebElement ele : links){
           System.out.println(ele.getText() +" ---- "+ ele.getAttribute("href"));

           if(ele.getText().equals("Get more information about coronavirus"))
           {
               ele.click();
               break;
           }
       }


       Thread.sleep(4000);

     //  driver.quit();






    }




}
