package rlazio.pid.processor;

public class PidProcessorFactory {
	
	
	public PidProcessor get(String layout, String siglaProvincia) {
		try {
			String layoutClass = TemplateDecoder.decode(layout);
			Class pidProcessorClass = Class.forName(layoutClass);
			PidProcessor pidProcessor = (PidProcessor) pidProcessorClass.getConstructor(String.class).newInstance(siglaProvincia);
			return pidProcessor;
		} catch (Exception e) {
			throw new RuntimeException("Impossibile instanziare il processor",e);
		}
	}
		
}
