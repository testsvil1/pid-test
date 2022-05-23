package test;

import java.io.File;
import java.util.Arrays;

public class PidFileSet {
	
	private boolean sort = true;
	File baseDir;
	
	public PidFileSet(String dir) {
		this.baseDir = new File(dir);
	}

	public String[] getFiles() {
		String[] fileList = baseDir.list();
		if (sort) {
			Arrays.sort(fileList);
		}
		return fileList;
	}
	
	
}
