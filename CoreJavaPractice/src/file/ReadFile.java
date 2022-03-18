package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ReadFile {

	public static void readFile(File file) throws IOException {

		StringBuilder sb = new StringBuilder();
		
		InputStream in = new FileInputStream(file);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		
		
		String line;
		while((line = br.readLine())!=null) { //here we store into line variable and check also is is not null
		
			sb.append(line+ System.lineSeparator());
			
		}
		
		System.out.println(sb);
	}

	public static void main(String[] args) {
		
		File file = new File("/home/rahul/git/JavaCodepractice/CoreJavaPractice/src/file/doc.txt");
		
		String content = null;
		try{
			readFile(file);
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		
	}

}
