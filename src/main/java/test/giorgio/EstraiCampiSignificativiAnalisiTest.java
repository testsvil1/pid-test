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

public class EstraiCampiSignificativiAnalisiTest {
	
	public static void main(String[] args) {
		long now = System.currentTimeMillis();
		String path = "C:/work/20220822_PID_Paramucchi/pid";
		PidFileSet pidFileSet = new PidFileSet(path);
		String[] fileList = pidFileSet.getFiles();
		//System.out.println(fileList.length);
		System.out.println("codiceFiscale;S/M;codComunicazione;codComPrecedente;comPrecPresente;tipoCom;file;dataInvio;Denominazione");
//		for (int i = 0; i < fileList.length; i++) {
//			String fileName = fileList[i];
//			if (fileName.length()>20) {
//				System.out.println(fileName);
//			}
//		}

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

				DatiInvio datiInvio = new DatiInvio(str, ret);
				
				System.out.println(dumpcsv(datiInvio.asList()));
				
				
			}	

		} catch (Exception e) {
			e.printStackTrace();
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

}
