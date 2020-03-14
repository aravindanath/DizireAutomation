	package fileHandling;

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.Properties;

	public class sravanthi_read {

		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
			String path = System.getProperty("user.dir")+File.separator+"data"+File.pathSeparator+"config.properties";
			
			FileInputStream fi = new FileInputStream(path);
			Properties ab = new Properties();
			
			ab.load(fi);
			String p = ab.getProperty("stagingurl");
			System.out.println(p);
			
			

		}

}
