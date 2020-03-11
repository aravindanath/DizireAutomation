package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
	
	public static void main(String[] args) throws IOException {
		
		
		String path = System.getProperty("user.dir")+File.separator+"data"+File.separator+"config.properties";
		FileInputStream fis = new FileInputStream(path);
		
		Properties prop = new Properties();
		prop.load(fis);
		String val = prop.getProperty("stagingurl");
		System.out.println(val);
		String bro = prop.getProperty("browser");
		System.out.println(bro);
		
		
		
		
		 
		
	}
	

}
