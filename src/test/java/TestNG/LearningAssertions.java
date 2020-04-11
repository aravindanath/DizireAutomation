package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LearningAssertions {
	
	
	@Test(priority=1)
	public void assertionDemo() {
		
		System.out.println("Started..");
		int i = 10;
		Assert.assertEquals(20, i);
		System.out.println("ended..");
		
	}
	
	@Test(priority=2)
	public void softAssertionDemo() {
		System.out.println("Started..");
		SoftAssert sf=  new SoftAssert();
		sf.assertEquals(20, 10);
		System.out.println("ended..");
		sf.assertAll();
		
		
	}

}
