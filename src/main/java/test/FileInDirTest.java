package test;

import java.io.File;

public class FileInDirTest {

	public static void main(String[] args) {

		
		
		String path = "C:\\work\\22-02-25_PID_Paramucchi\\PID\\Prospetti_2022_ROMA";
		File file = new File(path);

	    // returns an array of all files
	    String[] fileList = file.list();
	    
	    for(String str : fileList) {
	      System.out.println(str);
	    }

	    System.out.println(fileList.length);
		
	}
	
	
}
