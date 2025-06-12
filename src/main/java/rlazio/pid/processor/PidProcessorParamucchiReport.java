package rlazio.pid.processor;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.datatype.XMLGregorianCalendar;

import it.gov.lavoro.servizi.unipi.Convenzione;
import it.gov.lavoro.servizi.unipi.Esoneri;
import it.gov.lavoro.servizi.unipi.ProspettoGenerale;
import it.gov.lavoro.servizi.unipi.Sospensione;
import it.gov.lavoro.servizi.unipi.Statoconcessione;
import rlazio.pid.processor.PidProcessor;

public class PidProcessorParamucchiReport implements PidProcessor {

	private static DateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");

	String siglaProvincia;
	String codiceProvincia;

	public PidProcessorParamucchiReport(String siglaProvincia) {
		this.siglaProvincia = siglaProvincia;
		this.codiceProvincia = ProvinciaDecoder.decode(siglaProvincia);
	}

	@Override
	public String[] getHeader() {
		
		return new String[] { 
				
				"Nr Lavoratori Nazionali", 
				
				"CF/P.IVA", "DENOMINAZIONE", "CCNL", 
				
				"COMUNE SEDE LEGALE", "CAP", "INDIRIZZO",
				
				"Nr Lavoratori Base di computo Disabili Prov " + siglaProvincia,
				"Nr Lavoratori Base Computo art.18 Prov " + siglaProvincia, "Disabili Prov " + siglaProvincia, "Art.18 Prov "  + siglaProvincia,
				"Quota Riserva Disabili Prov " + siglaProvincia, "Quota Riserva Art.18 Prov " + siglaProvincia, "Scoperture Disabili Prov " + siglaProvincia,
				"Scoperture Art.18 Prov " + siglaProvincia, "PROVINCIA", 
				
				"Disabili in forza Nazionale", "Art.18 in forza Nazionale", "Quota Riserva Disabili Nazionale", 
				"Quota Riserva Art.18 Nazionale", "Scopertura Disabili Nazionale", "Scopertura Art.18 Nazionale", 
				
				// ----
				
				"Data Invio", "Tipo Comunicazione", "Codice Comunicazione", "Codice Comunicazione Precedente",
								
				"Num Centralinisti non vedenti", "Num Centralinisti tempo pieno", "Num Centralinisti part-time",
				
				"Num Massofisioterapisti non vedenti", "Num Massofisioterapisti tempo pieno", "Num Massofisioterapisti part-time",
				
				"Recapito mail del referente aziendale",
				
				"Stato sospensione " + siglaProvincia, "Causale sospensione", "Data fine sospensione", "N lavoratori sospensione",
				
				"Stato Esonero " + siglaProvincia , "Data atto Esonero", "Estremi atto", "Fino al", "Percentuale", "N lavoratori in esonero",
				
				"Stato Convenzione " + siglaProvincia, "Data atto Convenzione ", "Estremi atto", "Tipologia di convenzione", "Numero Lavoratori Previsti", "Data stipula", "Data scadenza"
				
		};
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

				
				// ----				

				
				row.add(ret.getDataInvio().toGregorianCalendar().getTime());
				row.add(ret.getTipocomunicazione());
				row.add(ret.getCodicecomunicazione());
				row.add(ret.getCodicecomunicazioneprecedente());

				row.add(ret.getQuadro2().get(j).getDatiprovinciali().getNposticentralinisti());
				row.add(ret.getQuadro2().get(j).getPersonaledipendente().getCentralinisti().getNlavoratoritempopieno());
				row.add(""+ret.getQuadro2().get(j).getPersonaledipendente().getCentralinisti().getParttime().size());

				//--
				
				row.add(ret.getQuadro2().get(j).getDatiprovinciali().getNpostimassofisioterapisti());
				row.add(ret.getQuadro2().get(j).getPersonaledipendente().getMassofisioterapisti().getNlavoratoritempopieno());
				row.add(""+ret.getQuadro2().get(j).getPersonaledipendente().getMassofisioterapisti().getParttime().size());

				//--
				
				row.add(ret.getQuadro1().getDatiaziendali().getReferente().getEmail());
				
				Sospensione sospensione = ret.getQuadro2().get(j).getSospensioni();
				row.add(sospensione != null ? "" + decodeStatoconcessione(sospensione.getStato()) : "");
				row.add(sospensione != null ? "" + sospensione.getCausale() : "");
				row.add(sospensione != null ? date2String(sospensione.getDatafinesospensione()) : "");
				row.add(sospensione != null ? "" + sospensione.getNumerolavoratori() : "");
				
				Esoneri esoneri = ret.getQuadro2().get(j).getEsoneri();
				row.add(esoneri != null ? "" + decodeStatoconcessione(esoneri.getStato()) : "");
				row.add(esoneri != null ? date2String(esoneri.getDataatto()) : "");
				row.add(esoneri != null ? esoneri.getEstremiatto() : "");
				row.add(esoneri != null ? date2String(esoneri.getFinoal()) : "");
				row.add(esoneri != null ? esoneri.getPercentuale() : "");
				row.add(esoneri != null ? esoneri.getNumerolavoratori() : "");
				
				Convenzione convenzione = ret.getQuadro2().get(j).getConvenzione();
				row.add(convenzione != null ? decodeStatoconcessione(convenzione.getStato()) : "");
				row.add(convenzione != null ? date2String(convenzione.getDataatto()) : "");
				row.add(convenzione != null ? convenzione.getEstremiatto() : "");
				row.add(convenzione != null ? convenzione.getTipoconvenzione() : "");
				row.add(convenzione != null ? convenzione.getNumLavoratoriPrevisti() : "");
				row.add(convenzione != null ? date2String(convenzione.getDatastipula()) : "");
				row.add(convenzione != null ? date2String(convenzione.getDataconcessione()) : "");
				
				res.add(row);
			}
		}

		return res;

	}

	private static String date2String(Date data) {
		return DATE_FORMAT.format(data);
	}

	
	private static String date2String(XMLGregorianCalendar data) {
		return ((data!=null) && (data.toGregorianCalendar()!=null)) ? DATE_FORMAT.format(data.toGregorianCalendar().getTime()) : "";
	}

	private static String decodeStatoconcessione(Statoconcessione statoconcessione) {
		if (statoconcessione==Statoconcessione.E) { return "Approvata/Concessa";}
		if (statoconcessione==Statoconcessione.F) { return "Richiesta";}
		return "";	
	}
	

}
