package fileHandling;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utilits.BasePage;

import java.io.IOException;

public class TestCase02 {

    WebDriver driver;


    @BeforeTest
    public void setup() throws IOException {

       String browser = BasePage.getValue("browser");

       if(browser.equalsIgnoreCase("chrome")){
           WebDriverManager.chromedriver().setup();
           driver = new ChromeDriver();


       }else if(browser.equalsIgnoreCase("firefox")){
           WebDriverManager.firefoxdriver().setup();
           driver = new FirefoxDriver();
       }


    }


    @Test
    public void openAmazon() throws IOException, InterruptedException {

        driver.get(BasePage.getValue("TC002","url"));

        Thread.sleep(2000);

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(BasePage.getValue("TC002","search"), Keys.ENTER);


    }


    @AfterTest
    public void close() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }

}
