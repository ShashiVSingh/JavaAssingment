package StringProg;

import java.io.FileNotFoundException;

public class CopyFile extends  FileBase{

	public static void main(String[] args) throws FileNotFoundException {
		String targetFilePath = "c:\\ProgramListQues - Copy.txt";
		String sourceFilePath = "c:\\ProgramListQues.txt";
		copyFileContent(sourceFilePath, targetFilePath);
		
		String fileContent=getFileContent(targetFilePath);
		System.out.println(fileContent);
	}

}
