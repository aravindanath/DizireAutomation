package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties_Ganesh {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String rePath = System.getProperty("user.dir") + File.separator + "data" + File.separator + "config.properties";
		System.out.println(rePath);

		FileInputStream fis = new FileInputStream(rePath);
		Properties pro = new Properties();
		pro.load(fis);
		
		System.out.println(pro.values());
		
	}

}
