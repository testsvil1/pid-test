package rlazio.pid.processor.unused;

import java.util.ArrayList;
import java.util.List;

import it.gov.lavoro.servizi.unipi.ProspettoGenerale;
import rlazio.pid.processor.PidProcessor;
import rlazio.pid.processor.ProvinciaDecoder;
import test.DatiProspettoAccessor;

public class PidProcessorTipo2 implements PidProcessor{

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
	
	
	
	
//	String siglaProvincia;
//	String codiceProvincia;
//	
//	public PidProcessorTipo2(String siglaProvincia) {
//		this.siglaProvincia = siglaProvincia;
//		this.codiceProvincia = ProvinciaDecoder.decode(siglaProvincia);
//	}
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
//				
//				row.add( new DatiProspettoAccessor(ret.getQuadro1().getDatiprospetto()).getNLavoratoriNazionali() );
//
//				row.add(ret.getQuadro1().getDatiaziendali().getDichiarante().getCodicefiscale());
//				row.add(ret.getQuadro1().getDatiaziendali().getDichiarante().getDenominazione());
//				row.add(ret.getQuadro1().getDatiaziendali().getDichiarante().getCcnl());
//				
//				row.add(ret.getQuadro1().getDatiaziendali().getSedelegale().getComunesedelegale());
//				row.add(ret.getQuadro1().getDatiaziendali().getSedelegale().getCapsedelegale());
//				row.add(ret.getQuadro1().getDatiaziendali().getSedelegale().getIndirizzosedelegale());
//				
//				row.add(ret.getQuadro3().getElencoriepilogativoprovinciale().get(j).getNumLavBaseComputoArt3());
//				row.add(ret.getQuadro3().getElencoriepilogativoprovinciale().get(j).getNumLavBaseComputoArt18());						
//				row.add(ret.getQuadro3().getElencoriepilogativoprovinciale().get(j).getDisabili());
//				row.add(ret.getQuadro3().getElencoriepilogativoprovinciale().get(j).getCatprotette());
//				row.add(ret.getQuadro3().getElencoriepilogativoprovinciale().get(j).getQuotariservadisabili());
//				row.add(ret.getQuadro3().getElencoriepilogativoprovinciale().get(j).getQuotariservacatprotette());
//				row.add(ret.getQuadro3().getElencoriepilogativoprovinciale().get(j).getScoperturedisabili());
//				row.add(ret.getQuadro3().getElencoriepilogativoprovinciale().get(j).getScoperturecatprotette());
//				row.add(ret.getQuadro3().getElencoriepilogativoprovinciale().get(j).getProvincia());
//
//				res.add(row);
//			}	
//		}
//		
//		return res;
//
//	}
//	
//	
//	@Override
//	public String[] getHeader() {
////		return new String[] {"Nr Lavoratori Nazionali",  "CF/P.IVA","DENOMINAZIONE", "CCNL", 
////								"COMUNE SEDE LEGALE", "CAP", "INDIRIZZO", 
////								"Nr Lavoratori Base di computo Disabili Prov VT", "Nr Lavoratori Base Computo art.18 Prov VT", "Disabili Prov. VT", 
////								"Art. 18 Prov VT", "Quota Riserva Disabili Prov VT", "Quota Riserva Art.18 Prov VT", 
////								"Scoperture Disabili Prov VT", "Scoperture  Art.18 Prov VT", "siglaProvincia"};
//		
//		
//		
//		return new String[] {"Nr Lavoratori Nazionali",  "CF/P.IVA","DENOMINAZIONE", "CCNL", 
//				"COMUNE SEDE LEGALE", "CAP", "INDIRIZZO", 
//				"Nr Lavoratori Base di computo Disabili Prov " + siglaProvincia , "Nr Lavoratori Base Computo art.18 Prov " + siglaProvincia , "Disabili Prov. " + siglaProvincia , 
//				"Art. 18 Prov " + siglaProvincia , "Quota Riserva Disabili Prov " + siglaProvincia , "Quota Riserva Art.18 Prov " + siglaProvincia , 
//				"Scoperture Disabili Prov " + siglaProvincia , "Scoperture  Art.18 Prov " + siglaProvincia , "PROVINCIA"};
//
//	}
//	

}
