package rlazio.pid.processor;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import it.gov.lavoro.servizi.unipi.ProspettoGenerale;
import rlazio.pid.processor.PidProcessor;

public class PidProcessorParamucchiRmRitardoConMail implements PidProcessor {

	private static DateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");
	
	String siglaProvincia;
	String codiceProvincia;
	
	public PidProcessorParamucchiRmRitardoConMail(String siglaProvincia) {
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
				"Quota Riserva Disabili Nazionale", "Quota Riserva Art.18 Nazionale", "Scopertura Disabili Nazionale", "Scopertura Art.18 Nazionale",
				"Codice Comunicazione", "Data Invio", "Tipo Comunicazione", "Codice Comunicazione Precedente",
				"Sede Legale Mail", "Sede Legale PEC", "Referente Mail"};
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
				
				row.add(ret.getCodicecomunicazione());
				row.add(date2String(ret.getDataInvio().toGregorianCalendar().getTime()));
				row.add(ret.getTipocomunicazione());
				row.add(ret.getCodicecomunicazioneprecedente());

				row.add(ret.getQuadro1().getDatiaziendali().getSedelegale().getEmail());
				row.add(ret.getQuadro1().getDatiaziendali().getSedelegale().getPECemail());
				row.add(ret.getQuadro1().getDatiaziendali().getReferente().getEmail());
				
				res.add(row);
			}
		}

		return res;

	}
	
	private static String date2String(Date data) {
		return DATE_FORMAT.format(data);
	}

	
}
