package rlazio.pid.processor;

import java.util.HashMap;
import java.util.Map;

public class ProvinciaDecoder {
	
	
	private static Map<String, String> PROVINCIE = new HashMap<String,String>();
	
	static {
		PROVINCIE.put("FR", "060");
		PROVINCIE.put("LT", "059");
		PROVINCIE.put("RI", "057");
		PROVINCIE.put("RM", "058");
		PROVINCIE.put("VT", "056");
		
		PROVINCIE.put("RM_C1", "058");
		PROVINCIE.put("RM_C2", "058");
		PROVINCIE.put("RM_C3", "058");

		PROVINCIE.put("RI_C1", "057");
		PROVINCIE.put("VT_C1", "056");

		PROVINCIE.put("RI_C3", "057");
		PROVINCIE.put("VT_C3", "056");

		PROVINCIE.put("FR_C3", "060");
		PROVINCIE.put("LT_C3", "059");

	}
	
	
	public static String decode(String siglaProvincia) {
		return PROVINCIE.get(siglaProvincia.toUpperCase());
	}
	
	public static String decodeAndCheck(String siglaProvincia) {
		String codice = decode(siglaProvincia);
		if (codice==null) {
			throw new RuntimeException("Sigla provincia " + siglaProvincia + " non riconosciuta");
		}
		return codice;
	}
	
}
