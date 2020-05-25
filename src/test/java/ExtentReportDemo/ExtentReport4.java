package ExtentReportDemo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import utilits.BasePage;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentReport4 {

    public ExtentHtmlReporter htmlReporter;
    public ExtentReports extent;
    public ExtentTest test;
    public WebDriver driver;
    String os = System.getProperty("os");


    @BeforeTest
    public void extentReportSetup() throws IOException {
        String path = System.getProperty("user.dir")+ File.separator+"test-output"+ File.separator+"Report"+ BasePage.currentDate()+ ".html";
        htmlReporter = new ExtentHtmlReporter(path);
        htmlReporter.config().setDocumentTitle("Automation Report for Regression Suite"); // Title of the report
        htmlReporter.config().setReportName("Functional Report for Jio Mart"); // name of the report
        htmlReporter.config().setTheme(Theme.STANDARD);
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        extent.setSystemInfo("Env", BasePage.getValue("env"));
        extent.setSystemInfo("os", os);
        extent.setSystemInfo("Tester Name", "ARAVINDA");
        extent.setSystemInfo("Browser", BasePage.getValue("browser"));
        extent.setSystemInfo("BuildVersion", BasePage.getValue("build"));

    }


    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        System.out.println("Launch Browser");
        driver.get("https://www.jiomart.com/");
    }


    @Test
    public void tc001() throws InterruptedException {
        test = extent.createTest("tc001");
        test.info("User is on "+driver.getCurrentUrl());
        driver.findElement(By.cssSelector("#rel_pincode")).sendKeys("560037");
        Thread.sleep(2000);
        String city = driver.findElement(By.cssSelector("#rel_pin_msg")).getText();
        test.info("Delivery city: " + city);
        driver.findElement(By.xpath("//button[text()='Start Shopping']")).click();


    }

    @Test
    public void TC0002() throws IOException {
        driver.get("https://www.amazon.in");
        test = extent.createTest("TC0002");
        String title = driver.getTitle();
        System.out.println(title);
        test.info("Title: " + title);
        test.info("=== user is on Amazon home page ====");

        test.log(Status.PASS, "THis case pass");

        Assert.assertEquals(title, title);
        try {
            int i = 10 / 0;
            System.out.println(i);
        } catch (Exception e) {
            test.error(e.getMessage());
            test.log(Status.FAIL, "\"Fail..\"");
            test.fail("Fail..");
            Assert.fail("Fail.....");
        }
    }


    @Test
    public void TC0003()
    {
        test = extent.createTest("TC0003");
        throw new SkipException("Skip this case");

    }

    @AfterMethod
    public void tearDown(ITestResult result) throws IOException {
        if (result.getStatus() == ITestResult.FAILURE) {
            test.log(Status.FAIL, "Result status: " + result.getStatus());
            test.log(Status.FAIL, "TEST CASE FAILED IS " + result.getName()); // to add name in extent report
            test.log(Status.FAIL, "TEST CASE FAILED IS " + result.getThrowable()); // to add error/exception in extent
            // report
            String screenshotPath = getScreenshot(driver, result.getName());
            System.out.println("+****"+screenshotPath);
            test.addScreenCaptureFromPath(screenshotPath);// adding screen shot go report
            test.addScreenCaptureFromPath(screenshotPath,"Title");
        } else if (result.getStatus() == ITestResult.SKIP) {
            test.log(Status.SKIP, "Result status: " + result.getStatus());
            test.log(Status.SKIP, "Test Case SKIPPED IS " + result.getName());
        } else if (result.getStatus() == ITestResult.SUCCESS) {
            test.log(Status.PASS, "Result status: " + result.getStatus());
            test.log(Status.PASS, "Test Case PASSED IS " + result.getName());
        }
        driver.quit();
    }

    @AfterTest
    public void endReport() {
        extent.flush();
    }

    public static String getScreenshot(WebDriver driver, String screenshotName) throws IOException {

        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);

        // after execution, you could see a folder "FailedTestsScreenshots" under src
        // folder
        String destination = System.getProperty("user.dir") + "/Screenshots/" + screenshotName + ".png";
        File finalDestination = new File(destination);
        FileUtils.copyFile(source, finalDestination);
        return destination;
    }



}
