package learningCollections;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExampleArrayList2 {


    @Test
    public void dropdown() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.wikipedia.org/");

        Thread.sleep(2000);

       List<WebElement> lang = driver.findElements(By.xpath("//select[@id='searchLanguage']/option"));


       System.out.println("Total no of lang: "+lang.size());


        Thread.sleep(2000);

        ArrayList<String> empty = new ArrayList<String>();

        for(WebElement list : lang){

            empty.add(list.getText());
            if(list.getText().equals("हिन्दी")){
                list.click();
            }

        }
        Thread.sleep(4000);
        System.out.println("Un sorted list: "+ empty);

        Collections.sort(empty);

        System.out.println(" sorted list: "+ empty);

        driver.quit();






    }




}
