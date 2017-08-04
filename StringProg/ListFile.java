package StringProg;

import java.io.File;

public class ListFile {

	public static void main(String[] args) {
		File folder = new File ("c:\\Intel\\Logs");
		File [] listOfFiles = folder.listFiles();
		
		for (int i = 0; i < listOfFiles.length; i++){
			if (listOfFiles[i].isFile()){
				System.out.println("Files" + listOfFiles[i].getName());
			} else
				if(listOfFiles[i].isDirectory()){
					System.out.println("Directory" + listOfFiles[i].getName());
				}
			
		}

	}

}
