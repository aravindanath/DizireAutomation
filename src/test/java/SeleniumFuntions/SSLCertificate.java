package SeleniumFuntions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SSLCertificate {

    WebDriver driver;

    @BeforeTest
    public void openBrowser(){
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--ignore-certificate-errors");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(ops);
    }

    @Test
    public void sslHandling(){
        driver.get("https://cacert.org/");

    }

}
