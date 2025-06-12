package rlazio.pid.processor;

import java.util.ArrayList;
import java.util.List;

import it.gov.lavoro.servizi.unipi.ProspettoGenerale;
import rlazio.pid.processor.PidProcessor;

public class PidProcessorParamucchiRm implements PidProcessor {

	String siglaProvincia;
	String codiceProvincia;
	
	public PidProcessorParamucchiRm(String siglaProvincia) {
		this.siglaProvincia = siglaProvincia;
		this.codiceProvincia = ProvinciaDecoder.decode(siglaProvincia);
	}


	@Override
	public String[] getHeader() {
		return new String[] { "Nr Lavoratori Nazionali", "CF/P.IVA", "DENOMINAZIONE", "CCNL", "COMUNE SEDE LEGALE",
				"CAP", "INDIRIZZO", "Nr Lavoratori Base di computo Disabili Prov " + siglaProvincia,
				"Nr Lavoratori Base Computo art.18 Prov " + siglaProvincia, "Disabili Prov " + siglaProvincia, "Art.18 Prov "  + siglaProvincia,
				"Quota Riserva Disabili Prov " + siglaProvincia, "Quota Riserva Art.18 Prov " + siglaProvincia, "Scoperture Disabili Prov " + siglaProvincia,
				"Scoperture Art.18 Prov " + siglaProvincia, "PROVINCIA", "Disabili in forza Nazionale", "Art.18 in forza Nazionale",
				"Quota Riserva Disabili Nazionale", "Quota Riserva Art.18 Nazionale", "Scopertura Disabili Nazionale", "Scopertura Art.18 Nazionale" };
	}

	
	
	
	public List<List<Object>> process(ProspettoGenerale ret) {

		List<List<Object>> res = new ArrayList<List<Object>>();

		for (int j = 0; j < ret.getQuadro3().getElencoriepilogativoprovinciale().size(); j++) {

			if (ret.getQuadro3().getElencoriepilogativoprovinciale().get(j).getProvincia().equals(codiceProvincia)) {

				List<Object> row = new ArrayList<Object>();

				row.add(new DatiProspettoAccessor(ret.getQuadro1().getDatiprospetto()).getNLavoratoriNazionali());

				row.add(ret.getQuadro1().getDatiaziendali().getDichiarante().getCodicefiscale());
				row.add(ret.getQuadro1().getDatiaziendali().getDichiarante().getDenominazione());
				row.add(ret.getQuadro1().getDatiaziendali().getDichiarante().getCcnl());

				row.add(ret.getQuadro1().getDatiaziendali().getSedelegale().getComunesedelegale());
				row.add(ret.getQuadro1().getDatiaziendali().getSedelegale().getCapsedelegale());
				row.add(ret.getQuadro1().getDatiaziendali().getSedelegale().getIndirizzosedelegale());

				row.add(ret.getQuadro3().getElencoriepilogativoprovinciale().get(j).getNumLavBaseComputoArt3());
				row.add(ret.getQuadro3().getElencoriepilogativoprovinciale().get(j).getNumLavBaseComputoArt18());
				row.add(ret.getQuadro3().getElencoriepilogativoprovinciale().get(j).getDisabili());
				row.add(ret.getQuadro3().getElencoriepilogativoprovinciale().get(j).getCatprotette());
				row.add(ret.getQuadro3().getElencoriepilogativoprovinciale().get(j).getQuotariservadisabili());
				row.add(ret.getQuadro3().getElencoriepilogativoprovinciale().get(j).getQuotariservacatprotette());
				row.add(ret.getQuadro3().getElencoriepilogativoprovinciale().get(j).getScoperturedisabili());
				row.add(ret.getQuadro3().getElencoriepilogativoprovinciale().get(j).getScoperturecatprotette());
				row.add(ret.getQuadro3().getElencoriepilogativoprovinciale().get(j).getProvincia());

				row.add(ret.getQuadro3().getRiepilogonazionale().getDisabili());
				row.add(ret.getQuadro3().getRiepilogonazionale().getCatprotette());
				row.add(ret.getQuadro3().getRiepilogonazionale().getQuotariservadisabili());
				row.add(ret.getQuadro3().getRiepilogonazionale().getQuotariservacatprotette());
				row.add(ret.getQuadro3().getRiepilogonazionale().getScoperturedisabili());
				row.add(ret.getQuadro3().getRiepilogonazionale().getScoperturecatprotette());

				res.add(row);
			}
		}

		return res;

	}
}
