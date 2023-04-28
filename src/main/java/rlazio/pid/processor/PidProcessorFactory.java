package rlazio.pid.processor;

public class PidProcessorFactory {
	
	
	public PidProcessor get(String siglaProvincia) {
		if ("RM".contains(siglaProvincia)) {
			return new PidProcessorTipo1(siglaProvincia);
		}
		if ("RM_C1".contains(siglaProvincia)) {
			return new PidProcessorTipoRmCaso1();
		}
		if ("RM_C2".contains(siglaProvincia)) {
			return new PidProcessorTipo2("RM");
		}
		if ("RM_C3".contains(siglaProvincia)) {
			return new PidProcessorParamucchiRm("RM");
		}
		if ("FR,LT,RI,VT".contains(siglaProvincia)) {
			return new PidProcessorTipo2(siglaProvincia);
		}
		if ("RI_C1,VT_C1".contains(siglaProvincia)) {
			return new PidProcessorTipo1(siglaProvincia.substring(0, 2));
		}
		if ("RI_C3,VT_C3".contains(siglaProvincia)) {
			return new PidProcessorParamucchiRm(siglaProvincia.substring(0, 2));
		}
		if ("FR_C3,LT_C3".contains(siglaProvincia)) {
			return new PidProcessorParamucchiRm(siglaProvincia.substring(0, 2));
		}		
		// non dovremmo mai arrivare qui, eventuali input sbagliati dovrebbero essere individuati prima
		throw new RuntimeException("Impossibile instanziare il processor");
	}
		
}
