package rlazio.pid.processor;

public class PidProcessorFactory {
	
	
	public PidProcessor get(String siglaProvincia) {
		if ("RM".contains(siglaProvincia)) {
			return new PidProcessorTipo1();
		}
		if ("FR,LT,RI,VT".contains(siglaProvincia)) {
			return new PidProcessorTipo2(siglaProvincia);
		}
		// non dovremmo mai arrivare qui, eventuali input sbagliati dovrebbero essere individuati prima
		throw new RuntimeException("Impossibile instanziare il processor");
	}

}
