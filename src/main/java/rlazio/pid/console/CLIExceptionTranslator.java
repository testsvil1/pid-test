package rlazio.pid.console;

import org.apache.commons.cli.MissingArgumentException;
import org.apache.commons.cli.MissingOptionException;
import org.apache.commons.cli.ParseException;
import org.apache.commons.cli.UnrecognizedOptionException;

import rlazio.pid.processor.PidException;

// implementa una traduzione dei messaggi di errore 
public class CLIExceptionTranslator {

	public RuntimeException translate(ParseException exception) {
		if (exception instanceof MissingOptionException) {
			return new PidException("Opzioni obbligatorie mancanti: " + ((MissingOptionException)exception).getMessage().substring(((MissingOptionException)exception).getMessage().indexOf(":")));
		}
		if (exception instanceof MissingArgumentException) {
			return new PidException("Argomento mancante per l'opzione: " + ((MissingArgumentException)exception).getOption().getOpt());
		}
		if (exception instanceof UnrecognizedOptionException) {
			return new PidException("Opzione non riconosciuta: " + ((UnrecognizedOptionException)exception).getOption());
		}
		
		return new RuntimeException("",exception);
	}
	
	
}
