package test.giorgio;

import java.util.ArrayList;
import java.util.List;

import it.gov.lavoro.servizi.unipi.ProspettoGenerale;


public class PidProcessor2 implements PidProcessor {

	// un pid puo' produrre piu righe del prospetto
	// ogni riga e' rappresentata come lista di stringhe

	public List<List<String>> process(ProspettoGenerale ret) {

		List<List<String>> res = new ArrayList<List<String>>();
		
				
		List<String> row = new ArrayList<String>();
		row.add(ret.getCodicecomunicazione());
		row.add(ret.getCodicecomunicazioneprecedente());
		row.add(ret.getTipocomunicazione());
		row.add(ret.getDataInvio().toString());

		row.add(ret.getQuadro1().getDatiaziendali().getDichiarante().getDenominazione());
		row.add(ret.getQuadro1().getDatiaziendali().getDichiarante().getCodicefiscale());

		res.add(row);

	return res;

}}
