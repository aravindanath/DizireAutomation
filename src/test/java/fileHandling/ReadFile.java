package fileHandling;

import java.io.*;

public class ReadFile {
	
	public static void main(String[] args) throws IOException {
		
		
		String path = System.getProperty("user.dir")+File.separator+"data"+File.separator+"demo.txt";
		File f  = new File(path);
		Reader r = new FileReader(f);
		BufferedReader br = new BufferedReader(r);
		 
		String x = "";
		while((x = br.readLine())!=null) {
			System.out.println(x);
		}
		
//		System.out.println(br.readLine()); ;
//		System.out.println(br.readLine()); ;
		
	}
	

}
