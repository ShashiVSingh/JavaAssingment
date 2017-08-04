package StringProg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class FileStringReplace extends FileBase{

	public static void main(String[] args) throws FileNotFoundException {
		String filePath = "c:\\ProgramListQues.txt";
		File file = new File(filePath);
		if(!file.exists() || !file.canRead() ){  //this condition check whther file exist or not and can read
			System.out.println("Either do not exist or can't read the file");
		} else{
			System.out.println("File exist and can read");
		}
		
		Reader ir = new InputStreamReader(new FileInputStream(file));//programe reads from right to left(innermost fun will be called first)
		
		BufferedReader br = new BufferedReader(ir); //buffereader gives flexibilty to read i.e, by line or char etc
		StringBuilder sb = new StringBuilder();  //append means to add. as assigned as string formate in memory to read & write 
		String line;  // its a variable to read n write
		try {
			while((line = br.readLine())!=null){
				
				sb.append(line);
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String replacedStr=sb.toString().replaceAll("Java", "Python");
		//System.out.println(replacedStr +line+);
		System.out.println("Original text\t"+sb + "\nReplaced text\t"+replacedStr);
		
		/*String fileContent=getFileContent(filePath);
		String replacedStr=fileContent.replaceAll("Java", "Python"); // using FileBase then no need to StringBuilder
		//System.out.println(replacedStr +line+);
		System.out.println("Original text\t"+fileContent + "\nReplaced text\t"+replacedStr);*/
		
		
	}

}
