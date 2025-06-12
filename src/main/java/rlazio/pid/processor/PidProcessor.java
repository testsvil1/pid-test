package rlazio.pid.processor;

import java.util.List;

import it.gov.lavoro.servizi.unipi.ProspettoGenerale;

public interface PidProcessor {

	// un pid puo' produrre piu righe del prospetto
	// ogni riga e' rappresentata come lista di stringhe
	public List<List<Object>> process(ProspettoGenerale ret);
	
	
	
	// Intestazioni fisse
	public String[] getHeader();
	
	
}
