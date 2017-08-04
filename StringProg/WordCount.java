package StringProg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class WordCount {

	public static void main(String[] args) {
		String filePath = "c:\\ProgramListQues.txt";
		File file = new File(filePath);
		if (!file.exists() || !file.canRead()) {
			System.out.println("Either File does not exist or can not read the file");
		}else{
		    System.out.println("File exsit and able to read");
			}
		
		try {
			Reader ir = new InputStreamReader(new FileInputStream(file));
			BufferedReader br = new BufferedReader(ir);
			String line;
			int wordCount=0;
			
			int lineCount=1;
			while((line=br.readLine())!=null)
			{
				int lineWordCount=0;
				lineWordCount=line.split(" ").length;
				wordCount=wordCount+lineWordCount;
				System.out.println("Word count in lines\t"+lineCount + "\tis\t" +lineWordCount);
				System.out.println(line);
				lineCount+=1;
			}
			System.out.println("total word count=\t" + wordCount);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
