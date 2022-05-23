package test;

import java.util.ArrayList;
import java.util.List;

public class ExceptionCollector {
	
	
	static List<Exception> exceptions = new ArrayList<Exception>();
	
	
	static void add(Exception e) {
		exceptions.add(e);
		e.printStackTrace(System.err);
	}
	

//	public static class ExceptionCollectorItem{		
//		String file;
//		String auxMessage;
//		Map<String,Object> details;    
//		Exception exception;
//	}

}
