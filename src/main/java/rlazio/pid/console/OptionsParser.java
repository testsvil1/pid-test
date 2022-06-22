package rlazio.pid.console;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

import rlazio.pid.PidException;
import rlazio.pid.processor.ProvinciaDecoder;



public class OptionsParser {
	
	public OptionConfig parse(String[] args) {
		try {
			
			Option optHelp = new Option("help", "Stampa questo messaggio di aiuto");
			Option optXmlDir =  Option.builder("xmldir")
			        				.argName("dir")
			        				.hasArg()
			        				.desc("Percorso della directory che contiene gli xml da processare")
			        				.build();
			Option optFile =  Option.builder("outfile")
    								.argName("file")
    								.hasArg()
    								.desc("Percorso del file excel prodotto")
    								.build();
			Option optProvincia =  Option.builder("prv")
									.argName("sigla")
									.hasArg()
									.desc("Sigla della provincia di riferimento per cui si sta eseguendo la generazione del file (FR, LT, RI, RM, VT)")
									.build();

			Option optOverwrite =  Option.builder("y")
									.argName("file")
									.desc("Sovrascrive il file excel se gia' presente")
									.build();
			
			Options options = new Options();
			options.addOption(optXmlDir);
			options.addOption(optFile);
			options.addOption(optProvincia);
			options.addOption(optOverwrite);

			if (args.length==0) {
				HelpFormatter formatter = new HelpFormatter();
				formatter.setSyntaxPrefix("");
				formatter.setOptionComparator(null);
				String NL = System.getProperty("line.separator");
				String header = "Produce il quadro riassuntivo in formato excel di un insieme di prospetti informativi disabili in formato xml" + NL + NL;
				String footer = NL + "Esempio:" + NL + "   >pidgen  -xmldir c:/test/in  -outfile c:/summary.xlsx  -prv RM" + NL +
						        "Produce il file summary.xlsx contenente il quadro riassuntivo per la provncia di roma per i pid presenti nella directory c:/test/in";
				formatter.printHelp("pidgen", header, options, footer);
				return null;
			}
			
			CommandLineParser cmdParser = new DefaultParser();
			CommandLine cmdLine = cmdParser.parse(options, args);

			if (!cmdLine.hasOption(optXmlDir)) {
				throw new PidException("parametro xmlDIr non trovato");
			}
			String xmlDirValue = cmdLine.getOptionValue(optXmlDir);
			if (!cmdLine.hasOption(optFile)) {
				throw new PidException("parametro file non trovato");
			}
			String outFileValue = cmdLine.getOptionValue(optFile);
			if (!cmdLine.hasOption(optProvincia)) {
				throw new PidException("parametro provnvia non trovato");
			}
			String provinciaValue = cmdLine.getOptionValue(optProvincia);
			boolean overwriteValue = cmdLine.hasOption(optOverwrite);
			checkXmlInDirPath(xmlDirValue);
			checkXlsxFileOut(outFileValue, overwriteValue);
			checkProvincia(provinciaValue);
			
			OptionConfig config = new OptionConfig();
			config.xmldir = xmlDirValue;
			config.fileout = outFileValue;
			config.provincia = provinciaValue;
			return config;
			
		} catch (ParseException e) {
			throw new CLIExceptionTranslator().translate(e);
		}
	}


	private void checkXmlInDirPath(String pathStr) {
		File pathFile = new File(pathStr);
		if (!pathFile.exists() || !pathFile.isDirectory()) {
			throw new PidException("Directory " + pathStr + " non esistente");
		}
		String[] xmlFiles = pathFile.list(new FilenameFilter() {
		    public boolean accept(File dir, String name) {
		        return name.toLowerCase().endsWith(".xml");
		    }
		});
		if (xmlFiles.length==0) {
			throw new PidException("La directory " + pathStr + " non contiene file xml da processare");
		}
	}


	private void checkXlsxFileOut(String pathStr, boolean overwrite) {

		// controllo che il file sia un xlsx
		// if (pathFile.getName().endsWith("xlsx")) {
		File pathFile = new File(pathStr);
		if (!pathFile.getName().toLowerCase().endsWith(".xlsx")) {
			throw new PidException("File " + pathStr + " non valido. Il file deve avere estensione xlsx");
		}
		if (pathFile.exists() && !overwrite) {
			throw new PidException("File " + pathStr + " gia' presente usare l'opzione -y per sovrascriverlo");
		}
		Path path = Paths.get(pathFile.getAbsoluteFile().getParent());
	    try {
			Files.createDirectories(path);
		} catch (IOException e) {
			throw new PidException("Impossibile creare il file " + pathStr);
		}
	    
	}

    private void checkProvincia(String provincia) {
    	if (ProvinciaDecoder.decode(provincia)==null) {
    		throw new PidException("Provincia non valida " +provincia);
    	}
    }
	

	public static void main(String[] args) {
		new OptionsParser().parse(args);
	}
	
}
