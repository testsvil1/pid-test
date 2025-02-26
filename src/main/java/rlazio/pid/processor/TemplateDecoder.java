package rlazio.pid.processor;

import java.util.HashMap;
import java.util.Map;

public class TemplateDecoder {
	
	
	private static Map<String, String> TEMPLATE = new HashMap<String, String>();
	
	static {
		TEMPLATE.put("Sito".toUpperCase(), "rlazio.pid.processor.PidProcessorParamucchiRm");
		TEMPLATE.put("Ritardo".toUpperCase(), "rlazio.pid.processor.PidProcessorParamucchiRmRitardo");
		TEMPLATE.put("Mail".toUpperCase(), "rlazio.pid.processor.PidProcessorParamucchiRmRitardoConMail");

	}
	
	
	public static String decode(String template) {
		return TEMPLATE.get(template.toUpperCase());
	}
	


	
	
	
}
