package TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Logs implements ITestListener{

	public void onTestStart(ITestResult result) {
		Reporter.log("=== Test case pass ===" + result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		Reporter.log("=== Test case sucess ===" + result.getName());
		
	}

	public void onTestFailure(ITestResult result) {
		Reporter.log("=== Test case fail ===" + result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		Reporter.log("=== Test case skip ===" + result.getName());
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		Reporter.log("=== Test case sucess per ===" + result.getName());
		
	}

	public void onStart(ITestContext context) {
		Reporter.log("=== Test case context ===" + context.getName());
		
	}

	public void onFinish(ITestContext context) {
		Reporter.log("=== Test case on fisinsh ===" + context.getName());
		
	}

}
