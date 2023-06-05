package rlazio.pid.processor;

import java.util.HashMap;
import java.util.Map;

public class TemplateDecoder {
	
	
	private static Map<String, String> TEMPLATE = new HashMap<String, String>();
	
	static {
		TEMPLATE.put("Pubblicazione".toUpperCase(), "rlazio.pid.processor.PidProcessorParamucchiRm");
		TEMPLATE.put("Ritardo".toUpperCase(), "rlazio.pid.processor.PidProcessorParamucchiRmRitardo");

	}
	
	
	public static String decode(String template) {
		return TEMPLATE.get(template.toUpperCase());
	}
	


	
	
	
}
