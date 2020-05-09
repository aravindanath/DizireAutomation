package utilits;

import org.ini4j.Ini;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
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


    public static void mouseHover(WebDriver driver, WebElement target){
        Actions act = new Actions(driver);
        act.moveToElement(target).build().perform();
    }


    public static void actionsClick(WebDriver driver, WebElement target){
        Actions act = new Actions(driver);
        act.click(target).build().perform();
    }

    public static void dragAndDrop(WebDriver driver, WebElement src, WebElement tgt){
        Actions act = new Actions(driver);
        act.dragAndDrop(src,tgt).build().perform();
    }


    public static void rightClick(WebDriver driver, WebElement element){
        Actions act = new Actions(driver);
        act.contextClick(element).build().perform();

    }

    public static void doubleClick(WebDriver driver, WebElement element){
        Actions act = new Actions(driver);
        act.doubleClick(element).build().perform();

    }

    public static void selectByValue(WebElement element,String val){
        Select sel = new Select(element);
        sel.selectByValue(val);
    }

    public static void selectByIndex(WebElement element,int index){
        Select sel = new Select(element);
        sel.selectByIndex(index);
    }

    public static void selectByVisible(WebElement element,String val){
        Select sel = new Select(element);
        sel.selectByVisibleText(val);
    }


    public static void deselectByValue(WebElement element,String val){
        Select sel = new Select(element);
        sel.deselectByValue(val);
    }

    public static void deselectByIndex(WebElement element,int index){
        Select sel = new Select(element);
        sel.deselectByIndex(index);
    }

    public static void deSelectByVisibleText(WebElement element,String val){
        Select sel = new Select(element);
        sel.deselectByVisibleText(val);
    }


    public static void deselectAllValue(WebElement element){
        Select sel = new Select(element);
        sel.deselectAll();
    }



}
