package fileHandling;

import java.io.*;

public class CreateFile {
	
	public static void main(String[] args) throws IOException {
		
		
		String path = System.getProperty("user.dir")+File.separator+"data"+File.separator+"demo.txt";
		System.out.println(path);
		File f  = new File(path);
		if(!f.exists()){
			f.createNewFile();
			System.out.println("File created!");
		}else{
			System.out.println("File exist!");
		}

		Writer w = new FileWriter(f) ;
		BufferedWriter bw = new BufferedWriter(w);
	 	bw.write("Hello good evening");
	 	bw.flush();
	 	bw.close();
		
	}
	

}
