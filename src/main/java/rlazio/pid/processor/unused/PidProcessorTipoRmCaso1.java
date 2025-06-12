package rlazio.pid.processor.unused;

import java.util.List;

import it.gov.lavoro.servizi.unipi.ProspettoGenerale;
import rlazio.pid.processor.PidProcessor;

public class PidProcessorTipoRmCaso1 implements PidProcessor{

@Override
	public String[] getHeader() {
		// TODO Auto-generated method stub
		return null;
	}

@Override
	public List<List<Object>> process(ProspettoGenerale ret) {
		// TODO Auto-generated method stub
		return null;
	}
	
//
//	
//	String codiceProvincia = "058";
//	String siglaProvincia =  "RM";
//	
//	
//	public List<List<String>> process(ProspettoGenerale ret) {
//
//		List<List<String>> res = new ArrayList<List<String>>();
//
//		for (int j = 0; j < ret.getQuadro3().getElencoriepilogativoprovinciale().size(); j++) {
//			
//			if (ret.getQuadro3().getElencoriepilogativoprovinciale().get(j).getProvincia()
//					.equals(codiceProvincia)) {
//
//				List<String> row = new ArrayList<String>();
//				
//				row.add(ret.getQuadro1().getDatiaziendali().getDichiarante().getCodicefiscale());
//				row.add(ret.getQuadro1().getDatiaziendali().getDichiarante().getDenominazione());
//				row.add(ret.getQuadro1().getDatiaziendali().getSedelegale().getPECemail());
//				row.add(date2String(ret.getDataInvio()));
//				row.add(""+ret.getTipocomunicazione());
//
//				row.add(ret.getQuadro3().getElencoriepilogativoprovinciale().get(j).getQuotariservadisabili());
//				row.add(ret.getQuadro3().getElencoriepilogativoprovinciale().get(j).getScoperturedisabili());
//
//				res.add(row);
//			} 
//			
//			
//		}
//		
////		if (res.size()==0) {
////			System.out.println("Cc " + ret.getCodicecomunicazione());
////		}
//		return res;
//
//	}
//	
//	
//	@Override
//	public String[] getHeader() {
//				
//		return new String[] {"CF/P.IVA","Denominazione", "Pec/Email", "Data Invio", "Tipo Comunicazione", 
//				"Quota Riserva Disabili Prov " + siglaProvincia ,  
//				"Scoperture Disabili Prov " + siglaProvincia} ;
//
//	}
//	
//
//	
//	private String date2String(XMLGregorianCalendar calendar) {
//		return new SimpleDateFormat("dd/MM/yyyy").format(calendar.toGregorianCalendar().getTime());
//		
//	}
}
