package test;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBIntrospector;

import it.gov.lavoro.servizi.unipi.ProspettoGenerale;

/*
 * =================================
 * 
 * Estrazione centralinisti non vedenti
 * Dato percorso pid e provincia restituisce a video un csv
 * 
 * 
 * Refactor di 
 * /pid-test/src/main/java/test/JaxbMassiveTestRichiestaParamucchi2_2024.java
 * 18 Maggio 2022
 * Richiesta di Paramucchi a Claudia 
 * "estrapolare dai prospetti di Roma i dati dei centralinisti non vedenti"
 * 
 * =================================
 */


public class CentralinistiNonVedentiMain {
	
	
	
	public static void main(String[] args) {
		
//		ProvinciaDecoder
//		PROVINCIE.put("FR", "060");
//		PROVINCIE.put("LT", "059");
//		PROVINCIE.put("RI", "057");
//		PROVINCIE.put("RM", "058");
//		PROVINCIE.put("VT", "056");
		
		//String path = "C:/work/pid/Estrazioni/2024/Prospetti_ROMA_2024";
		String path = "C:/work/pid/Estrazioni/2024/Prospetti_2024_VITERBO";
		String provincia = rlazio.pid.processor.ProvinciaDecoder.decodeAndCheck("VT");
		main0(path, provincia);
	}

	public static void main0(String path, String provincia) {

		long now = System.currentTimeMillis();
		// String path = "C:\\work\\22-02-25_PID_Paramucchi\\PID\\Prospetti_2022_ROMA";
		
			
		
		File file = new File(path);

		// returns an array of all files
		String[] fileList = file.list();

//		List<String> header = new ArrayList<String>(); 
//
//		header.add("emailDelegato");
//		
//		header.add("Codicefiscale");
//		header.add("getDenominazione");
//		header.add("getCcnl");
//		header.add("getCapsedelegale");
//		header.add("getIndirizzosedelegale");
//		header.add("getTelefono");
//		
//		header.add("getCognome");
//		header.add("getNome");
//		header.add("getTelefono");
//		header.add("getEmail");
//
//		header.add("getCognome");
//		header.add("getStato");		
//		
//		header.add("getProvincia");
//		header.add("getNumLavBaseComputoArt3");
//		header.add("getNumLavBaseComputoArt18");
//		header.add("getDisabili");
//		header.add("getCatprotette");
//		header.add("getQuotariservadisabili");
//		header.add("getQuotariservacatprotette");
//		header.add("getScoperturedisabili");
//		header.add("getScoperturecatprotette");
//
//		
//		dumpcsv(header);

		
		System.out.println("e-mailDelegato;dichiarante_denominazione;dichiarante_codiceFiscale;dichiarante_ccnl;sedeLegale_cap;sedeLegale_indirizzo;sedeLegale_telefono;sedeLegale_email;referente_cognome;referente_nome;referente_telefono;referente_email;datiProvinciali_referente_cognome;nazionale_numLavBaseComputoArt3;nazionale_numLavBaseComputoArt18;nazionale_quotariservadisabili;nazionale_quotariservacatprotette;nazionale_disabili;nazionale_protette;nazionale_esuberiaArt18;nazionale_scopertureDisabili;nazionale_scopertureCatProtette;provinciale_provincia;provinciale_baseComputoArt3;provinciale_baseComputoArt18;provinciale_disabilii;provinciale_catprotette;provinciale_quotaRiservaDisabili;provinciale_quotaRiservaCatProtette;provinciale_scopertureDisabili;provinciale_scopertureCatProtette;convenzione;N_Centralinisti;N_Centralinisti_TempoPieno;N_Centralinisti_PartTime");
		int c=0;
		try {
			
			JAXBContext context = JAXBContext.newInstance(ProspettoGenerale.class);

			for (String str : fileList) {
				// System.out.println(str);
				String fileName = path + "\\" + str;
				ProspettoGenerale ret = null;
				ret = (ProspettoGenerale) JAXBIntrospector
						.getValue(context.createUnmarshaller().unmarshal(new FileReader(fileName)));

				// String codComunicazione = ret.getCodicecomunicazione();
				for (int i = 0; i < ret.getQuadro2().size(); i++) {

					if (ret.getQuadro2().get(i).getDatiprovinciali().getProvincia().equals(provincia)) {
						
						
						String s = ret.getQuadro2().get(i).getDatiprovinciali().getNposticentralinisti();
						String s1 = ret.getQuadro2().get(i).getPersonaledipendente().getCentralinisti().getNlavoratoritempopieno();
						int s2 = ret.getQuadro2().get(i).getPersonaledipendente().getCentralinisti().getParttime().size();
						
						
						boolean isNposticentralinisti = (s!=null) && (Integer.parseInt(s)>0) ; 
						boolean isNlavoratoritempopieno = (s1!=null) && (Integer.parseInt(s1)>0) ;
						
//						if (!isNposticentralinisti && isNlavoratoritempopieno) {
//							System.err.println("*** OKKIO ****  " + ret.getQuadro1().getDatiaziendali().getDichiarante().getCodicefiscale() + " central " + s + " tpieno " + s1 + " parz " + s2);
//						} 
//						
//						if (isNposticentralinisti && !isNlavoratoritempopieno) {
//							System.out.println("##### OKKIO ####  " + ret.getQuadro1().getDatiaziendali().getDichiarante().getCodicefiscale() + " central " + s + " tpieno " + s1 + " parz " + s2);
//						} 

								
						if (isNposticentralinisti) {
							c++;
						
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
										.equals(provincia)) {
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
							row.add(ret.getQuadro2().get(i).getDatiprovinciali().getNposticentralinisti());
							row.add(ret.getQuadro2().get(i).getPersonaledipendente().getCentralinisti().getNlavoratoritempopieno());
							row.add(""+ret.getQuadro2().get(i).getPersonaledipendente().getCentralinisti().getParttime().size());
							
							//System.out.println(dumpcsv(row));
							String line = dumpcsv(row);
							line = line.replace("\n", " ");
							line = line.replace(";null;", ";;");
							System.out.println(line);
							
						}
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
		System.out.println("Num Righe = " + c);
		System.out.println("t = " + ((System.currentTimeMillis() - now) / 1000) + "sec");
	}

	private static String dumpcsv(List<String> row) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < row.size(); i++) {
			sb.append(row.get(i)).append(";");
		}
		return sb.toString();
	}

}