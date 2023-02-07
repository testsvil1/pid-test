package test;

import java.util.List;
import java.util.Map;

import test.giorgio.DatiInvio;

public class PidAccumulator {
	
	Accumulator internal = new Accumulator();
			
	public void add(DatiInvio datiInvio) {
		internal.put(datiInvio.getCodiceFiscale(), datiInvio);
	}		

	
	public List<Object> get(String key){
		return internal.get(key);
	}

	public int size() {
		return internal.size();
	}
	
	public Map<String, List<Object>> getInternalMap(){
		return internal.getInternalMap();
	}
	
}
