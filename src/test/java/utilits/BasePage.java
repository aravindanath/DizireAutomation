package utilits;

import org.ini4j.Ini;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BasePage {

    /**
     * @Author
     * @param key
     * @return
     * @throws IOException
     *
     * This method will get value based on given key.
     */

    public static String getValue(String key) throws IOException {
        String path = System.getProperty("user.dir") + File.separator + "data" + File.separator + "config.properties";
        FileInputStream fis = new FileInputStream(path);
        Properties prop = new Properties();
        prop.load(fis);
        String url = prop.getProperty(key);
        return url;
    }

    /**
     *
     * @param header
     * @param key
     * @return
     * @throws IOException
     */

    public static String getValue(String header, String key) throws IOException {
        String path = System.getProperty("user.dir") + File.separator + "data" + File.separator + "data.ini";
        FileInputStream fis = new FileInputStream(path);
        Ini i = new Ini();
        i.load(fis);
        String val = i.get(header,key);
        return val;
    }

    
    
    public static void assertTitle(String actual, String expected) {
    	Assert.assertEquals(actual, expected, "Title Mismatch");
    }
    
    public static void verifyButton(WebElement actual) {
    	Assert.assertTrue(actual.isDisplayed(), "Button is not displayed");
    }
    
    public static void verifyButtonEnabled(WebElement actual) {
    	Assert.assertTrue(actual.isEnabled(), "Button is not Enabled");
    }
    
    
    public static void sfassertTitle(String actual, String expected) {
    	 SoftAssert sf= new SoftAssert();
    	 sf.assertEquals(actual, expected,"Title mis match");
    	 sf.assertAll();
    }


    public static void acceptAlert(WebDriver driver){
        Alert alt = driver.switchTo().alert();
        System.out.println("Alert title: "+ alt.getText());
        alt.accept();
    }

    public static void dismissAlert(WebDriver driver){
        Alert alt = driver.switchTo().alert();
        System.out.println("Alert title: "+ alt.getText());
        alt.dismiss();
    }


    public static void acceptAlertAndSendValue(WebDriver driver,String value){
        Alert alt = driver.switchTo().alert();
        System.out.println("Alert title: "+ alt.getText());
        alt.sendKeys(value);
        alt.accept();
    }



}
