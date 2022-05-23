package test;

import java.io.FileReader;
import java.io.PrintWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBIntrospector;
import javax.xml.bind.Marshaller;
import javax.xml.namespace.QName;

import it.gov.lavoro.servizi.unipi.ProspettoGenerale;

public class JaxbTest {
	    	  public static void main(String[] args) {

	    	      JAXBContext jaxbContext = null;
	    	      try {
	    	    	  
	    	    	  String fileName= "C:\\work\\test\\pdfparsing\\eclipse-ws\\xmlPid\\src\\test\\resources\\1704722C00021095.xml";
	    	    	  JAXBContext context = JAXBContext.newInstance(ProspettoGenerale.class);
	    	    	  ProspettoGenerale ret = null;  
	    	    	  ret  =  (ProspettoGenerale)JAXBIntrospector.getValue(context.createUnmarshaller().unmarshal(new FileReader(fileName)));
	    	    	  
	    	    	  System.out.println(ret);
	    	    	  
	    	    	  
	    	    	  System.out.println(ret.getQuadro1().getDatiprospetto().getContent() );  //nlavoratoriNazionali);
	    	    	  
	    	    	  DatiProspettoAccessor accessor = new DatiProspettoAccessor( ret.getQuadro1().getDatiprospetto() );
	    	    	  accessor.getNLavoratoriNazionali();
	    	    	  
	    	    	  
	    	    	  
	    	    	  Marshaller jaxbMarshaller   = context.createMarshaller();
	    	    	  jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
	    	    	  JAXBElement<ProspettoGenerale> jaxbElement = 
	    	    	            new JAXBElement<ProspettoGenerale>( new QName("", "prospetto"), 
	    	    	            		ProspettoGenerale.class, 
	    	    	                      ret);
	    	    	  jaxbMarshaller.marshal( jaxbElement, new PrintWriter( System.out ) );
	    	    	  
	    	      } catch (Exception e) {
	    	          e.printStackTrace();
	    	      }

	    	  }

}
