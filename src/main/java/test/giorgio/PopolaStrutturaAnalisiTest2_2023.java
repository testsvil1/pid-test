package test.giorgio;

import java.io.FileReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBIntrospector;

import it.gov.lavoro.servizi.unipi.ProspettoGenerale;
import test.PidAccumulator;
import test.PidFileSet;
import test.StringUtils;

public class PopolaStrutturaAnalisiTest2_2023 {
	
	private static DateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");
	
	public static void main(String[] args) {
		long now = System.currentTimeMillis();
		String path = "C:/work/pid/Estrazioni/Prospetti_2023_ROMA 15.02.2023";
		PidFileSet pidFileSet = new PidFileSet(path);
		String[] fileList = pidFileSet.getFiles();
		//System.out.println(fileList.length);
		System.out.println("codiceFiscale;S/M;codComunicazione;codComPrecedente;comPrecPresente;tipoCom;file;dataInvio;Denominazione");

		PidAccumulator accumulator = new PidAccumulator();
		
		try {
			JAXBContext context = JAXBContext.newInstance(ProspettoGenerale.class);
			PidProcessor pidProcessor = new PidProcessor1();
			
			
			for (String str : fileList) {
				// System.out.println(str);
				String fileName = path + "\\" + str;
				ProspettoGenerale ret = null;
				ret = (ProspettoGenerale) JAXBIntrospector
						.getValue(context.createUnmarshaller().unmarshal(new FileReader(fileName)));

				DatiInvio datiInvio = new DatiInvio(str, ret);
				accumulator.add(datiInvio);
			
			}	

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
//		System.out.println(accumulator.size());
//		System.out.println(accumulator.get("00281310060"));
//		System.out.println(accumulator.get("06263170489"));
		
		List<String> validPidFiles = new ArrayList<String>();
		Map<String, List<Object>> internalMap = accumulator.getInternalMap();
		for(String key: internalMap.keySet()){
			List<Object> values = internalMap.get(key);
			DatiInvio datiInvio = (DatiInvio)values.get(values.size()-1);
		    System.out.println(key + " - " + datiInvio);
		    validPidFiles.add(datiInvio.getFileName());
		}

		
		System.out.println("codiceFiscale;descrizione;dataPrimoInvio;dataUltimoInvio;tipo;numInvii;anomalie");
		
		List<String> aziendeInadempienti = new ArrayList<String>();
		for(String key: internalMap.keySet()){
			
			List<Object> values = internalMap.get(key);
			
			Date dataCorrettoInvio = null;
			try {
				dataCorrettoInvio = new SimpleDateFormat("dd/MM/yyyy").parse("01/02/2023");
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			String descrizione = null;
			String codiceFiscale = null;
			boolean invioCorretto = false;
			boolean invioRitardo = false;
			Date dataPrimoInvio = null;
			Date dataUltimoInvio = null;
			String codiceComunicazionePrecedente = null;
			boolean comunicazionePrecedentePresente = false;
			String tipo = null;
			int numeroInvii = values.size();
			String nonTrovato = null;
			String errore = "";
			for (int i=0; i<values.size();i++) {
				DatiInvio datiInvio = (DatiInvio) values.get(i);
				descrizione = datiInvio.getDenominazione();
				codiceFiscale = datiInvio.getCodiceFiscale();
				tipo = datiInvio.getTipoComunicazione();
				codiceComunicazionePrecedente = datiInvio.getCodiceComunicazionePrecedente();
				nonTrovato = datiInvio.getCodComunicazPrecPresente();
//				if (codiceFiscale.equals("10212140965")){
//					System.out.println("break");
//				}
				Date dataInvio = datiInvio.getDataInvio();
				if (i==0) {
					dataPrimoInvio = dataInvio; 
				}
				if (i==values.size()-1) {
					dataUltimoInvio = dataInvio;
				}
				if (dataInvio.compareTo(dataCorrettoInvio)<0) {
					invioCorretto=true;
				}
				if (dataInvio.compareTo(dataCorrettoInvio)>=0) {
					invioRitardo=true;
				}				
			}
			if (!tipo.equals("01") && numeroInvii==1) {
				errore += "Comunicazione di rettifica/annullamento singola senza comunicazioni precedenti ";
			}
			if (!tipo.equals("01") && StringUtils.isEmpty(codiceComunicazionePrecedente)) {
				errore += "Comunicazione di rettifica/annullamento con codiceComunicazionePrecedente mancante ";
			}
			if (!tipo.equals("01") && ("NON TROVATO!").equals(nonTrovato)) {
				errore += "Comunicazione di rettifica/annullamento con codiceComunicazionePrecedente non esistente ";
			}
			
			if (invioRitardo && !invioCorretto) {
				aziendeInadempienti.add(codiceFiscale);
				System.out.println(codiceFiscale + ";" + descrizione + ";" + date2String(dataPrimoInvio) + ";" +  date2String(dataUltimoInvio) + ";"+  tipo + ";"+  values.size() + ";" + errore);
			}
		}
	
	}


private static String dumpcsv(List<String> row) {
	StringBuffer sb = new StringBuffer();
	for (int i = 0; i < row.size(); i++) {
		sb.append(row.get(i)).append(";");
	}
	String line = sb.toString();
	line = line.replace("\n", " ");
	line = line.replace(";null;", ";;");

	return line;
}

private static String date2String(Date data) {
	return DATE_FORMAT.format(data);
}


	public static List<String> ritornaSoloUltimiPid(List<String> fileList, String path){
		PidAccumulator accumulator = new PidAccumulator();
		
		try {
			JAXBContext context = JAXBContext.newInstance(ProspettoGenerale.class);
			PidProcessor pidProcessor = new PidProcessor1();
			
			
			for (String str : fileList) {
				// System.out.println(str);
				String fileName = path + "\\" + str;
				ProspettoGenerale ret = null;
				ret = (ProspettoGenerale) JAXBIntrospector
						.getValue(context.createUnmarshaller().unmarshal(new FileReader(fileName)));

				DatiInvio datiInvio = new DatiInvio(str, ret);
				accumulator.add(datiInvio);
			
			}	

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
//		System.out.println(accumulator.size());
//		System.out.println(accumulator.get("00281310060"));
//		System.out.println(accumulator.get("06263170489"));
		
		List<String> validPidFiles = new ArrayList<String>();
		Map<String, List<Object>> internalMap = accumulator.getInternalMap();
		for(String key: internalMap.keySet()){
			List<Object> values = internalMap.get(key);
			DatiInvio datiInvio = (DatiInvio)values.get(values.size()-1);
		    //System.out.println(key + " - " + datiInvio);
		    if (values.size()>1) {
		    	for(int i=0;i < values.size()-1; i++) {
		    		System.out.println(key + " - " + values.get(i));
		    	}
		    }
		    validPidFiles.add(datiInvio.getFileName());
		}

		return validPidFiles;
	}


}
