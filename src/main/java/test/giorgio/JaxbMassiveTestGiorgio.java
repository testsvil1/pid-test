package test.giorgio;

import java.io.FileReader;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBIntrospector;

import it.gov.lavoro.servizi.unipi.ProspettoGenerale;
import test.Counters;
import test.Dataset;
import test.PidFileSet;
import test.Row;

public class JaxbMassiveTestGiorgio {

	public static void main(String[] args) {

		long now = System.currentTimeMillis();
		//String path = "C:\\work\\22-02-25_PID_Paramucchi\\PID\\Prospetti ROMA 2022";
		//String path = "C:/work/test/pdfparsing/eclipse-ws/xmlPid/src/test/resources/T1";
		String path = "C:/work/test/pdfparsing/eclipse-ws/xmlPid/src/test/resources/T2";
		PidFileSet pidFileSet = new PidFileSet(path);
		

		// returns an array of all files
		String[] fileList = pidFileSet.getFiles();
		System.out.println(fileList.length);
		
		
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

		try {
			JAXBContext context = JAXBContext.newInstance(ProspettoGenerale.class);
			PidProcessor pidProcessor = new PidProcessor1();
			Dataset dataset = new Dataset();
			for (String str : fileList) {
				// System.out.println(str);
				String fileName = path + "\\" + str;
				ProspettoGenerale ret = null;
				ret = (ProspettoGenerale) JAXBIntrospector
						.getValue(context.createUnmarshaller().unmarshal(new FileReader(fileName)));

				List<List<String>> rows = pidProcessor.process(ret);

				
				for (List<String> row : rows) {
					String line = dumpcsv(row);
					line = line.replace("\n", " ");
					line = line.replace(";null;", ";;");
					System.out.println(line);
					dataset.add(new Row(row));
				}
			}	

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Comunicazione sovrascitte " + Counters.SOVRASCRITTI);
		System.out.println("Comunicazione Rettificate " + Counters.RETTIFICATI);
		System.out.println("Comunicazione Annullate " + Counters.ANNULLATI);
		System.out.println("Comunicazione Prospetti " + Counters.PROSPETTI);
		System.out.println("Comunicazione non trovati " + Counters.NON_TROVATI);
		System.out.println("Tempo di elebaorazione : " + ((System.currentTimeMillis() - now) / 1000) + "s");
	}

	private static String dumpcsv(List<String> row) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < row.size(); i++) {
			sb.append(row.get(i)).append(";");
		}
		return sb.toString();
	}

}