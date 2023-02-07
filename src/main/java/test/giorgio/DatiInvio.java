package test.giorgio;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import it.gov.lavoro.servizi.unipi.ProspettoGenerale;
import test.StringUtils;

public class DatiInvio {

	private static DateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");
	private static Set<String> insiemeCodiciComunicazione = new HashSet<String>();
	private static Set<String> insiemeCodiciFiscali = new HashSet<String>();
	
	String fileName; // nome del file xml del pid
	String codiceComunicazione;
	String codiceComunicazionePrecedente;
	String tipoComunicazione;
	Date dataInvio;
	String codiceFiscale; //codice fiscale dell'azienda
	String denominazione;
	String codComunicazPrecPresente; // indica se il codice comunicazione precedente e' presente tra i pid inviati
	String comunicazioneMultipla;
	
	
	public DatiInvio(String fileName, ProspettoGenerale ret) {
		this.fileName = fileName;
		this.codiceComunicazione = ret.getCodicecomunicazione();
		this.codiceComunicazionePrecedente = ret.getCodicecomunicazioneprecedente();
		this.tipoComunicazione = ret.getTipocomunicazione();
		this.dataInvio = ret.getDataInvio().toGregorianCalendar().getTime();
		this.codiceFiscale = ret.getQuadro1().getDatiaziendali().getDichiarante().getCodicefiscale();
		insiemeCodiciComunicazione.add(codiceComunicazione);
		this.comunicazioneMultipla = insiemeCodiciFiscali.add(codiceFiscale) ? "S" : "M";
		if (! StringUtils.isEmpty(codiceComunicazionePrecedente)) {
			codComunicazPrecPresente = insiemeCodiciComunicazione.contains(codiceComunicazionePrecedente) ? "OK" : "NON TROVATO!";
		}
		this.denominazione = ret.getQuadro1().getDatiaziendali().getDichiarante().getDenominazione();
	}

	public String getFileName() {
		return fileName;
	}

	public String getCodiceComunicazione() {
		return codiceComunicazione;
	}

	public String getCodiceComunicazionePrecedente() {
		return codiceComunicazionePrecedente;
	}

	public String getTipoComunicazione() {
		return tipoComunicazione;
	}

	public Date getDataInvio() {
		return dataInvio;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}
	
	public List<String> asList(){
		List<String> out  = new ArrayList<String>();
		out.add(codiceFiscale);
		out.add(comunicazioneMultipla);
		out.add(codiceComunicazione);
		out.add(codiceComunicazionePrecedente);
		out.add(tipoComunicazione);
		out.add(codComunicazPrecPresente);
		out.add(fileName);
		out.add(date2String(dataInvio));
		out.add(denominazione);
		return out;
	}
	
	
	private String date2String(Date data) {
		return DATE_FORMAT.format(data);
	}

	@Override
	public String toString() {
		return "DatiInvio [fileName=" + fileName + ", codiceComunicazione=" + codiceComunicazione
				+ ", tipoComunicazione=" + tipoComunicazione + ", dataInvio=" + date2String(dataInvio) + ", codiceFiscale="
				+ codiceFiscale + "]";
	}

	public String getCodComunicazPrecPresente() {
		return codComunicazPrecPresente;
	}

	public String getDenominazione() {
		return denominazione;
	}

	
}
