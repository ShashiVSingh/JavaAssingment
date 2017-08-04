package StringProg;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public abstract class FileBase {
	public static String getFileContent (String filePath) throws FileNotFoundException{
	if(!fileExists(filePath))
			System.out.println("Either do not exist or can't read the file");
	
	File file = new File(filePath);
	
	Reader ir = new InputStreamReader(new FileInputStream(file));//programe reads from right to left(innermost fun will be called first)
	BufferedReader br = new BufferedReader(ir); //buffereader gives flexibilty to read i.e, by line or char etc
	StringBuilder sb = new StringBuilder();  //append means to add. as assigned as string formate in memory to read & write 
	String line;  // its a variable to read n write
	try {
		while((line = br.readLine())!=null){
			sb.append(line+"\n");					}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return sb.toString();
}
	private static boolean fileExists(String filePath){
		File file = new File(filePath);
		if(!file.exists() ||!file.canRead()){
			return false;
		} 
		return true;
		
	}
	
	public static void copyFileContent (String sourceFilePath, String targetFilePath) throws FileNotFoundException{
		
		if(!fileExists(sourceFilePath)|| !fileExists(targetFilePath)){
			System.out.println("Either do not exist or can't read the file");
		return;
		}
		String sourceFileContent = getFileContent(sourceFilePath);
		writeFileContent(targetFilePath, sourceFileContent);
		
	}
	
	public static void writeFileContent(String filePath, String content) throws FileNotFoundException{
		if(!fileExists(filePath)){
			System.out.println("File does not exist");
		return;
	}
		File file=new File(filePath);
		Writer wr = new OutputStreamWriter(new FileOutputStream(file));
		BufferedWriter bw = new BufferedWriter(wr);
		try {
			bw.append(content);
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
