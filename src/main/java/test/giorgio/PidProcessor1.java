package test.giorgio;

import java.util.ArrayList;
import java.util.List;

import it.gov.lavoro.servizi.unipi.ProspettoGenerale;


public class PidProcessor1 implements PidProcessor{

	
	// un pid puo' produrre piu righe del prospetto
	// ogni riga e' rappresentata come lista di stringhe
	
	public List<List<String>> process(ProspettoGenerale ret) {

		List<List<String>> res = new ArrayList<List<String>>();
		
		for (int i = 0; i < ret.getQuadro2().size(); i++) {

			if (ret.getQuadro2().get(i).getDatiprovinciali().getProvincia().equals("058")) {
				
				List<String> row = new ArrayList<String>();

				row.add(ret.getCodicecomunicazione());
				row.add(ret.getCodicecomunicazioneprecedente());
				row.add(ret.getTipocomunicazione());

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
					if (ret.getQuadro3().getElencoriepilogativoprovinciale().get(j).getProvincia().equals("058")) {
						row.add(ret.getQuadro3().getElencoriepilogativoprovinciale().get(j).getProvincia());
						row.add(ret.getQuadro3().getElencoriepilogativoprovinciale().get(j).getNumLavBaseComputoArt3());
						row.add(ret.getQuadro3().getElencoriepilogativoprovinciale().get(j)
								.getNumLavBaseComputoArt18());
						row.add(ret.getQuadro3().getElencoriepilogativoprovinciale().get(j).getDisabili());
						row.add(ret.getQuadro3().getElencoriepilogativoprovinciale().get(j).getCatprotette());
						row.add(ret.getQuadro3().getElencoriepilogativoprovinciale().get(j).getQuotariservadisabili());
						row.add(ret.getQuadro3().getElencoriepilogativoprovinciale().get(j)
								.getQuotariservacatprotette());
						row.add(ret.getQuadro3().getElencoriepilogativoprovinciale().get(j).getScoperturedisabili());
						row.add(ret.getQuadro3().getElencoriepilogativoprovinciale().get(j).getScoperturecatprotette());
					}
				}

				row.add(ret.getQuadro2().get(i).getConvenzione() != null
						? ("" + ret.getQuadro2().get(i).getConvenzione().getStato())
						: "");

				res.add(row);
			}

		}
		
		return res;

	}
}
