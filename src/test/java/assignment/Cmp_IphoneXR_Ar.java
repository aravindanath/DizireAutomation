package assignment;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Cmp_IphoneXR_Ar {
    WebDriver driver;

    @BeforeTest
    public void openChrome() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    @Test
    public void CmpIphoneXR() throws InterruptedException {
        driver.get("https://amazon.in");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone XR 64GB-Yellow", Keys.ENTER);
        Thread.sleep(2000);
        String priceAmazon = driver.findElement(By.className("a-price-whole")).getText();
        int priceAz=Integer.parseInt(priceAmazon.replaceAll(",",""));
        System.out.println(priceAz);
       // driver.close();

        driver.get("https://flipkart.com");
        driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
        driver.findElement(By.className("LM6RPg")).sendKeys("iphone XR 64GB- Yellow", Keys.ENTER);
        Thread.sleep(2000);
        String priceFlipkart = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[2]/div/div[2]/div[2]/div/div/div/a/div[2]/div[2]/div[1]/div/div[1]")).getText();
        //System.out.println("Flipkart"+ priceFlipkart);

    }
    @AfterTest
    public void closebrowser()
    {
        driver.close();
    }
}