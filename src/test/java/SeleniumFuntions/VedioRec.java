package SeleniumFuntions;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import browsers.LaunchBrowser;
import utilits.BasePage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class VedioRec extends LaunchBrowser {

	/**
	 * Link to download ATUTestRecorder
	 * https://drive.google.com/file/d/0B6vnknygMB3IZVh3MWxnNUNfeEE/view
	 *
	 * @throws ATUTestRecorderException
	 */

//	ATUTestRecorder recorder;
//	DateFormat dateFormat = new SimpleDateFormat("dd-MM-yy HH-mm-ss");
//	Date d = new Date();

	@Test
	public void demo() throws ATUTestRecorderException {
//
//		recorder = new ATUTestRecorder(System.getProperty("user.dir") + File.separator + "test-output" + File.separator,
//				"TestVideo-" + dateFormat.format(d), true);
//		// To start video recording.
//		recorder.start();

		driver.get("https://www.expedia.co.in/");

		driver.findElement(By.cssSelector("#tab-flight-tab-hp")).click();
		WebElement ele = driver.findElement(By.xpath("//span[text()='One way']"));
		BasePage.jsClick(driver, ele);
		driver.findElement(By.xpath("(//div[@class='input-btn-group']/label/input)[1]"))
				.sendKeys("Bengaluru (BLR-Kempegowda Intl.)", Keys.ENTER);
		driver.findElement(By.xpath("(//div[@class='input-btn-group']/label/input)[2]"))
				.sendKeys("Boston, MA (BOS-Logan Intl.)", Keys.ENTER);
		driver.findElement(By.cssSelector("#flight-departing-single-hp-flight")).sendKeys("20/08/2020", Keys.ENTER);
		WebElement sel = driver.findElement(By.xpath("(//span[text()='Select'])[1]"));
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.elementToBeClickable(sel));
		BasePage.jsClick(driver, sel);

//		recorder.stop();
	}

}
