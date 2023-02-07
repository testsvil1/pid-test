package rlazio.pid.processor;

import java.util.ArrayList;
import java.util.List;

import it.gov.lavoro.servizi.unipi.ProspettoGenerale;
import rlazio.pid.processor.PidProcessor;

public class PidProcessorTipo1 implements PidProcessor{

	
	@Override
	public String[] getHeader() {
		//return new String[] {"Nr Lavoratori Nazionali","CF/P.IVA","DENOMINAZIONE","CCNL","COMUNE SEDE LEGALE","CAP","INDIRIZZO","Nr Lavoratori Base di computo Disabili Prov VT","Nr Lavoratori Base Computo art.18 Prov VT","Disabili Prov. VT","Art. 18 Prov VT","Quota Riserva Disabili Prov VT","Quota Riserva Art.18 Prov VT","Scoperture Disabili Prov VT","Scoperture  Art.18 Prov VT","PROVINCIA"};
		//return new String[] {"e-mailDelegato", "ns1:denominazione", "Codice Fiscale/P.Iva", "ns1:telefono", "ns1:email", "ns1:cognome", "ns1:nome", "ns1:telefono2", "ns1:email2", "ns1:cognome2", "ns1:numLavBaseComputoArt3", "ns1:numLavBaseComputoArt18", "ns1:quotariservadisabili", "ns1:quotariservacatprotette", "ns1:scoperturedisabili2", "ns1:scoperturecatprotette2", "ns1:stato"};
		return new String[] { "e-mailDelegato", "dichiarante_denominazione", "dichiarante_codiceFiscale",
				"dichiarante_ccnl", "sedeLegale_cap", "sedeLegale_indirizzo", "sedeLegale_telefono", "sedeLegale_email",
				"referente_cognome", "referente_nome", "referente_:telefono", "referente_email",
				"datiProvinciali_referente_cognome", "nazionale_numLavBaseComputoArt3",
				"nazionale_numLavBaseComputoArt18", "nazionale_quotariservadisabili",
				"nazionale_quotariservacatprotette", "nazionale_disabili", "nazionale_protette",
				"nazionale_esuberiaArt18", "nazionale_scopertureDisabili", "nazionale_scopertureCatProtette",
				"provinciale_provincia", "provinciale_baseComputoArt3", "provinciale_baseComputoArt18",
				"provinciale_disabilii", "provinciale_catprotette", "provinciale_quotaRiservaDisabili",
				"provinciale_quotaRiservaCatProtette", "provinciale_scopertureDisabili",
				"provinciale_scopertureCatProtette", "convenzione" };
	}
	
	
	

	public List<List<String>> process(ProspettoGenerale ret) {

		List<List<String>> res = new ArrayList<List<String>>();
		
		// String codComunicazione = ret.getCodicecomunicazione();
		for (int i = 0; i < ret.getQuadro2().size(); i++) {

			if (ret.getQuadro2().get(i).getDatiprovinciali().getProvincia().equals("058")) {
				List<String> row = new ArrayList<String>();

				row.add(ret.getEMailDelegato());
				row.add(ret.getQuadro1().getDatiaziendali().getDichiarante().getDenominazione());
				row.add(ret.getQuadro1().getDatiaziendali().getDichiarante().getCodicefiscale());
				row.add(ret.getQuadro1().getDatiaziendali().getDichiarante().getCcnl());
				row.add(ret.getQuadro1().getDatiaziendali().getSedelegale().getCapsedelegale());
				row.add(ret.getQuadro1().getDatiaziendali().getSedelegale().getIndirizzosedelegale());
				row.add(ret.getQuadro1().getDatiaziendali().getSedelegale().getTelefono());
				row.add(ret.getQuadro1().getDatiaziendali().getSedelegale().getEmail());

				row.add(ret.getQuadro1().getDatiaziendali().getReferente().getCognome());
				row.add(ret.getQuadro1().getDatiaziendali().getReferente().getNome());
				row.add(ret.getQuadro1().getDatiaziendali().getReferente().getTelefono());
				row.add(ret.getQuadro1().getDatiaziendali().getReferente().getEmail());

				row.add(ret.getQuadro2().get(i).getDatiprovinciali().getReferente().getCognome());

				row.add(ret.getQuadro3().getRiepilogonazionale().getNumLavBaseComputoArt3());
				row.add(ret.getQuadro3().getRiepilogonazionale().getNumLavBaseComputoArt18());
				row.add(ret.getQuadro3().getRiepilogonazionale().getQuotariservadisabili());
				row.add(ret.getQuadro3().getRiepilogonazionale().getQuotariservacatprotette());
				row.add(ret.getQuadro3().getRiepilogonazionale().getDisabili());
				row.add(ret.getQuadro3().getRiepilogonazionale().getCatprotette());
				row.add(ret.getQuadro3().getRiepilogonazionale().getQuotaesuberiArt18());
				row.add(ret.getQuadro3().getRiepilogonazionale().getScoperturedisabili());
				row.add(ret.getQuadro3().getRiepilogonazionale().getScoperturecatprotette());

				for (int j = 0; j < ret.getQuadro3().getElencoriepilogativoprovinciale().size(); j++) {
					// getProvinvia = 058 solo questa
					if (ret.getQuadro3().getElencoriepilogativoprovinciale().get(j).getProvincia()
							.equals("058")) {
						row.add(ret.getQuadro3().getElencoriepilogativoprovinciale().get(j).getProvincia());
						row.add(ret.getQuadro3().getElencoriepilogativoprovinciale().get(j)
								.getNumLavBaseComputoArt3());
						row.add(ret.getQuadro3().getElencoriepilogativoprovinciale().get(j)
								.getNumLavBaseComputoArt18());
						row.add(ret.getQuadro3().getElencoriepilogativoprovinciale().get(j).getDisabili());
						row.add(ret.getQuadro3().getElencoriepilogativoprovinciale().get(j).getCatprotette());
						row.add(ret.getQuadro3().getElencoriepilogativoprovinciale().get(j)
								.getQuotariservadisabili());
						row.add(ret.getQuadro3().getElencoriepilogativoprovinciale().get(j)
								.getQuotariservacatprotette());
						row.add(ret.getQuadro3().getElencoriepilogativoprovinciale().get(j)
								.getScoperturedisabili());
						row.add(ret.getQuadro3().getElencoriepilogativoprovinciale().get(j)
								.getScoperturecatprotette());
					}
				}

				row.add(ret.getQuadro2().get(i).getConvenzione() != null
						? ("" + ret.getQuadro2().get(i).getConvenzione().getStato())
						: "");
				//System.out.println(dumpcsv(row));
				res.add(row);
			}
		}
		
		
		return res;

	}
}
