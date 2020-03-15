package assignment;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;
import assignment.Test_WriteProp_methods_Arun;
import org.ini4j.Ini;
/***
 * 
 * @author Arun
 *
 */
public class Write_Properties_Arun{

	public static void main(String args[]) throws IOException {
		
		String p1 = System.getProperty("user.dir")+File.separator+"data"+File.separator+"config_arun.properties";
		//System.out.println(p1);
		OutputStream out = new FileOutputStream(p1,true);
		Properties p = new Properties();
		p.setProperty("UserID", "ArunR");
		p.setProperty("Passwd", "Asdf@2020");
		p.store(out,"Setprop Test");
		out.close();
		Test_WriteProp_methods_Arun.Writeto_Properties_Arun("URL","www.myntra.com");
		
		String p2 = System.getProperty("user.dir")+File.separator+"data"+File.separator+"Write_data_Arun.ini";
		OutputStream out1 = new FileOutputStream(p2,true);
		Ini i = new Ini();
		i.put("TC001", "URL", "www.youtube.com");
		i.put("TC001","Search", "Java");
		i.store(out1);
		out1.close();
		Test_WriteProp_methods_Arun.Writeto_Properties_Arun("TC001","URL","www.myntra.com");
	}
}