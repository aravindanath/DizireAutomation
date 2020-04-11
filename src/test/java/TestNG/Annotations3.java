package TestNG;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class Annotations3 {

	@Test
	public void openBrowser() {
		System.out.println("openBrowser ");
		throw new SkipException("Skipping.....");
	}

	@Test(dependsOnMethods="openBrowser")
	public void login() {
		System.out.println("login");
	}

	@Test(priority=2)
	public void search() {

		System.out.println("search");
		AssertJUnit.fail("Fail...");
	}

	@Test(priority=3)
	public void logout() {

		System.out.println("logout");
	}

	@Test(priority=4)
	public void closeBrowser() {

		System.out.println("closeBrowser");
	}

}
