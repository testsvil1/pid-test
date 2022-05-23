package test;

import java.util.ArrayList;
import java.util.List;

public class Dataset {
	
	List<String> codComunicazioneIdx = new ArrayList<String>();
	List<Row> internal = new ArrayList<Row>();
	
	public void add(Row row) {
		String codComunicazione = row.getCodComunicazione();
		if (codComunicazioneIdx.contains(codComunicazione)) {
			throw new RuntimeException(codComunicazione + " duplicato! ");
		}
		internal.add(row);
		codComunicazioneIdx.add(codComunicazione);
		//System.out.println("new -> " + codComunicazioneIdx);
		String codComunicazionePrecedente = row.getCodComunicazionePrecedente(); 
		if (! StringUtils.isEmpty(codComunicazionePrecedente)) {
			Counters.SOVRASCRITTI++;
			//System.out.println("-- FOUND " + codComunicazionePrecedente + " IN " + codComunicazione + " TipoComunicazione  " + row.getTipoComunicazione() + " --");
			//delete(codComunicazionePrecedente);
			if (row.getTipoComunicazione().equals("01")){
				Counters.PROSPETTI++;
			}
			if (row.getTipoComunicazione().equals("02")){
				Counters.RETTIFICATI++;
			}
			if (row.getTipoComunicazione().equals("03")){
				Counters.ANNULLATI++;
			}
			int found = codComunicazioneIdx.indexOf(codComunicazionePrecedente);
			//System.out.println(" -> " + codComunicazioneIdx);
			//System.out.println(codComunicazionePrecedente);
			//for (String string : codComunicazioneIdx) {
			//	System.out.print(string);
			//	System.out.print(" - ");
			//	System.out.println(string.equals(codComunicazionePrecedente));
			//}
			String presente = (found == -1) ? "NON PRESENTE" : ""; 
			row.data.add(2, presente);
			delete(codComunicazionePrecedente);
		} else {
			row.data.add(2, "");
		}

	}

	
	public void delete(String codComunicazione) {
		int found = codComunicazioneIdx.indexOf(codComunicazione); 
		
		if (found == -1) {
			//ExceptionCollector.add( new RuntimeException("Codice comunicazione " + codComunicazione + " non presente! (Cancellazione codComunicazione precedente)"));
			Counters.NON_TROVATI++;
		} else {	
			//System.out.println("-- DELETE --");
			codComunicazioneIdx.remove(found);
			internal.remove(found);
		}
	}
	

}
