package assignment;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

import org.ini4j.Ini;

/***
 * 
 * @author Arun
 *
 */
public class Test_WriteProp_methods_Arun {
	
	public static void Writeto_Properties_Arun(String key, String Value) throws IOException {
		String path = System.getProperty("user.dir")+File.separator+"data"+File.separator+"config_arun.properties";
		OutputStream out = new FileOutputStream(path,true);
		Properties p = new Properties();
		p.setProperty(key, Value);
		p.store(out, "SettinProperty Test");
		
	}

	public static void Writeto_Properties_Arun(String Header, String key, String Value) throws IOException {
		String path = System.getProperty("user.dir")+File.separator+"data"+File.separator+"Write_data_Arun.ini";
		OutputStream out = new FileOutputStream(path,true);
		Ini i = new Ini();
		i.put(Header, key, Value);
		i.store(out);
		
		
	}
}
