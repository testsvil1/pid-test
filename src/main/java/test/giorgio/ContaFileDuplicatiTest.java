package test.giorgio;

import java.util.ArrayList;
import java.util.List;

import test.PidFileSet;

public class ContaFileDuplicatiTest {
	
	public static void main(String[] args) {
		long now = System.currentTimeMillis();
		String path = "C:/work/20220822_PID_Paramucchi/pid";
		PidFileSet pidFileSet = new PidFileSet(path);
		String[] fileList = pidFileSet.getFiles();
		System.out.println(fileList.length);
		List<String> fileunivoci = new ArrayList<String>();
		for (int i = 0; i < fileList.length; i++) {
			String fileName = fileList[i];
			if (fileName.length()>20) {
				System.out.println(fileName);
			} else {
				fileunivoci.add(fileName);
			}
		}
	}

	
	
	
	public static List<String> eliminaDuplicati(String[] fileList) {
		List<String> fileunivoci = new ArrayList<String>();
		for (int i = 0; i < fileList.length; i++) {
			String fileName = fileList[i];
			if (fileName.length()>20) {
				System.out.println(fileName);
			} else {
				fileunivoci.add(fileName);
			}
		}
		return fileunivoci;
	}
	
	
	
}
