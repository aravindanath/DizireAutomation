package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class ExampleParam {
	
	
	@Parameters({"browser"})
	@Test
	public void terstCaseOne(String browser) {
		
		System.out.println("Browser passed is "+browser);
		
	}
	
	@Parameters({"user","pass"})
	@Test
	public void terstCaseTwo(String user,String pass) {
		
		System.out.println("User passed is "+user);
		System.out.println("Pass passed is "+pass);
		
	}
	
	

}
