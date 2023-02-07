package rlazio.pid;

import java.io.File;
import java.io.FileReader;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBIntrospector;

import it.gov.lavoro.servizi.unipi.ProspettoGenerale;
import rlazio.pid.console.OptionConfig;
import rlazio.pid.console.OptionsParser;
import rlazio.pid.console.ProgressBar;
import rlazio.pid.processor.PidProcessor;
import rlazio.pid.processor.PidProcessorFactory;
import test.giorgio.ContaFileDuplicatiTest;
import test.giorgio.PopolaStrutturaAnalisiTest2;
import test.xlsx.XlsxWriter;

public class PidExecutor2 {

	public static void main(String[] args) {

		long now = System.currentTimeMillis();
		OptionsParser optionsParser = new OptionsParser();
		OptionConfig optionConfig = optionsParser.parse(args);
		if (optionConfig==null) {
			return;
		}
		
		// String path = "C:\\work\\22-02-25_PID_Paramucchi\\PID\\Prospetti_2022_ROMA";
		String path = optionConfig.xmldir;
		File file = new File(path);

		String[] fileList0 = file.list();
		System.out.println("Eliminazione Dupicati");
		
		List<String> fileList1 = ContaFileDuplicatiTest.eliminaDuplicati(fileList0);
		
		System.out.println("Rimozione pid obsoleti");
		List<String> fileList2 = PopolaStrutturaAnalisiTest2.ritornaSoloUltimiPid(fileList1, path);

		String[] fileList = fileList2.toArray(new String[fileList2.size()]);
		
		PidProcessor pidProcessor = new PidProcessorFactory().get(optionConfig.provincia);

		XlsxWriter writer = new XlsxWriter(optionConfig.fileout);
		writer.open();
		writer.addheader(pidProcessor.getHeader());

		
		ProgressBar pb = new ProgressBar(fileList.length);
		
		int righe = 0;
		
		
		System.out.println("Analisi file xml");
		
		try {
			JAXBContext context = JAXBContext.newInstance(ProspettoGenerale.class);

			for (String str : fileList) {
				
				pb.progress();
				// System.out.println(str);
				String fileName = path + "\\" + str;
				ProspettoGenerale ret = null;
				try {
					ret = (ProspettoGenerale) JAXBIntrospector
							.getValue(context.createUnmarshaller().unmarshal(new FileReader(fileName)));
				} catch (Exception e) {
					System.out.println(">>>>" +  fileName);
					e.printStackTrace();
				}

				List<List<String>> rows = pidProcessor.process(ret);

				for (List<String> row : rows) {
					righe++;
					writer.write(row.toArray());
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
		System.out.println("Scrittura file excel...");
		writer.close();
		System.out.println("Analizzati " + fileList.length + " file xml, prodotte " + righe + " righe nel file excel");
		long totsec = (System.currentTimeMillis() - now) / 1000;
		long speed = fileList.length/totsec;
		System.out.println("Tempo di esecuzione: " + totsec + " sec  (" + speed + " files/sec)");
	}

}
