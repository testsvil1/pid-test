package test;

import java.io.File;
import java.util.Arrays;

public class FolderListOrderTest {
	
	
	public static void main(String[] args) {
		String path = "C:/work/pid/Estrazioni/Prospetti_2023_LATINA";
		File file = new File(path);

		String[] fileList = file.list();
		String[] fileList2 = fileList.clone();
		System.out.println(Arrays.equals(fileList, fileList2));
		Arrays.sort(fileList2);
		System.out.println(Arrays.equals(fileList, fileList2));
		
		
	}

}
