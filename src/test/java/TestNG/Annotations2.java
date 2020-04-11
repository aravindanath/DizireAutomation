package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Annotations2 {

	@Test
	public void openBrowser() {

		System.out.println("openBrowser ");
	}

	@Test(priority=1)
	public void login() {

		System.out.println("login");
	}

	@Test(priority=2)
	public void search() {

		System.out.println("search");
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
