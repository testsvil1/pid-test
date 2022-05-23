package test;

import javax.xml.bind.JAXBElement;

import it.gov.lavoro.servizi.unipi.Datiprospetto;

public class DatiProspettoAccessor {

	
	Datiprospetto datiProspetto;
	
	DatiProspettoAccessor(Datiprospetto datiProspetto){
		this.datiProspetto = datiProspetto;
	}
	
	public String getNLavoratoriNazionali() {
		return ""+ findElement("nlavoratorinazionali");
	}
	
	private Object findElement(String elementName) {
		for (JAXBElement<?> element : datiProspetto.getContent()) {
			if (element.getName().getLocalPart().equals(elementName)) {
				return element.getValue(); 
			}
		}
		throw new RuntimeException("Elemento "+ elementName + " non presente in DatiProspetto");
	}
	
}
