package test;

import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBIntrospector;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;

import it.gov.lavoro.servizi.unipi.ProspettoGenerale;

public class JaxbMassiveTestVT {

	public static void main(String[] args) {

		long now = System.currentTimeMillis();
		// String path = "C:\\work\\22-02-25_PID_Paramucchi\\PID\\Prospetti_2022_ROMA";
		String path = "C:\\work\\22-02-25_PID_Paramucchi\\PID\\Prospetti_2022_VITERBO";
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

		
		String codiceProvincia = "056"; // VIETERBO
		 
//		String codiceProvincia = "057"; // RIETI
		
		try {
			JAXBContext context = JAXBContext.newInstance(ProspettoGenerale.class);

			for (String str : fileList) {
				// System.out.println(str);
				String fileName = path + "\\" + str;
				ProspettoGenerale ret = null;
				ret = (ProspettoGenerale) JAXBIntrospector
						.getValue(context.createUnmarshaller().unmarshal(new FileReader(fileName)));

				// String codComunicazione = ret.getCodicecomunicazione();
				for (int j = 0; j < ret.getQuadro3().getElencoriepilogativoprovinciale().size(); j++) {
					
					
					if (ret.getQuadro3().getElencoriepilogativoprovinciale().get(j).getProvincia()
							.equals(codiceProvincia)) {

						List<String> row = new ArrayList<String>();
						
						
						row.add( new DatiProspettoAccessor(ret.getQuadro1().getDatiprospetto()).getNLavoratoriNazionali() );

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
						
						
						
						
						String line = dumpcsv(row);
						line = line.replace("\n", " ");
						line = line.replace(";null;", ";;");
						System.out.println(line);
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println((System.currentTimeMillis() - now) / 1000);
	}

	private static String dumpcsv(List<String> row) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < row.size(); i++) {
			sb.append(row.get(i)).append(";");
		}
		return sb.toString();
	}

}