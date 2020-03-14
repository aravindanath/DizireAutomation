package fileHandling;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class sravanthi_read {
	
	public static void main(String[] args) throws IOException {
		
		
	String path = System.getProperty("user.dir")+File.separator+"data"+File.pathSeparator+"sravanthi.txt";
	System.out.println(path);
		
	FileInputStream fis = new FileInputStream(path);
	
	Properties prop = new Properties();
	
	prop.load(fis);
		String v =prop.getProperty("url");
		System.out.println(v);		 
		
	}
	

}
