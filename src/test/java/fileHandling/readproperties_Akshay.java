package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class readproperties_Akshay {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path = System.getProperty("user.dir")+File.separator+"data"+File.pathSeparator+"config.properties";
		
		FileInputStream fis = new FileInputStream(path);
		Properties abc = new Properties();
		
		abc.load(fis);
		String v = abc.getProperty("stagingurl");
		System.out.println("bye");
		
		
		

	}

}
