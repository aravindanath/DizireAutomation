package fileHandling;

import java.io.*;
import java.util.Properties;

public class ReadProperties_Arun {
	public static void main(String args[]) throws Exception{
	
	String path = System.getProperty("user.dir")+File.separator+"data"+File.separator+"config.properties";
	System.out.println(path);
	InputStream fi = new FileInputStream(path);
	Properties p = new Properties();
	p.load(fi);
	System.out.print(p.getProperty("browser"));
	
	}
	
	
	
}
