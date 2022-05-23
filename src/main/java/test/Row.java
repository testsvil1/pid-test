package test;

import java.util.ArrayList;
import java.util.List;

public class Row {

	private int COD_COMUNICAZIONE_IDX = 0;
	private int COD_COMUNICAZIONE_PRECEDENTE_IDX = 1;
	private int TIPO_COMUNICAZIONE_IDX = 2;

	List<String> data = new ArrayList<String>();
	
	public Row(List<String> data) {
		this.data = data;
	}
	
	
	public String getCodComunicazione() {
		return data.get(COD_COMUNICAZIONE_IDX);
	}
	
	public String getCodComunicazionePrecedente() {
		return data.get(COD_COMUNICAZIONE_PRECEDENTE_IDX);
	}
	
	public String getTipoComunicazione() {
		return data.get(TIPO_COMUNICAZIONE_IDX);
	}
	
	
	
	
}
