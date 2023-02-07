package test.xlsx;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import javax.management.RuntimeErrorException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.IgnoredErrorType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestErrorWrite {

    String fileName;
    String sheetName;
    Workbook workbook;
    CreationHelper createHelper;
    Sheet sheet;
    int rowCount = 0;

	
	public TestErrorWrite(String fileName) {
		this.fileName = fileName;
		this.sheetName = null;
	}
	
	public TestErrorWrite(String fileName, String sheetName) {
		this.fileName = fileName;
		this.sheetName = sheetName;
	}
	

	
	public static void main(String[] args) {
		try {
			String fileName = "test.xlsx";
			Workbook workbook = new XSSFWorkbook();
			CreationHelper createHelper = workbook.getCreationHelper();
			Sheet sheet = workbook.createSheet();
			Row row = sheet.createRow(0);
			int columnCount = 0;
			Cell cell = row.createCell(columnCount++);
			cell.setCellValue("0123");
			cell.setCellType(CellType.STRING);
			//((XSSFSheet)sheet).addIgnoredErrors(new CellReference(cell), IgnoredErrorType.NUMBER_STORED_AS_TEXT);
			try (FileOutputStream outputStream = new FileOutputStream(fileName)) {
			    workbook.write(outputStream);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}
	
	
	
	public void open() {
		String excelType = checkFileName(fileName);
		if (excelType.equals("XSSF")) {
			workbook = new XSSFWorkbook();
		}
		if (excelType.equals("HSSF")) {
			workbook = new HSSFWorkbook();
		}
		createHelper = workbook.getCreationHelper();
		if (sheetName!=null) {
			sheet = workbook.createSheet(sheetName);
		} else {
			sheet = workbook.createSheet();
		}
	}
	
	
	public void write(Object[] data) {
        Row row = sheet.createRow(rowCount);
        int columnCount = 0;
        for (Object field : data) {
            Cell cell = row.createCell(columnCount);
            writeCell(cell, field);
            columnCount++;
        }
        rowCount++;
	}
	
	
	
	public void close() {
	    try {
			try (FileOutputStream outputStream = new FileOutputStream(fileName)) {
			    workbook.write(outputStream);
			}
		} catch (Exception e) {
			throw new RuntimeException("Errore nella scrittura de file " + fileName, e);
		} 
	}
	
	
	
	private String checkFileName(String fileName) {
		if (fileName.toLowerCase().endsWith("xlsx")) {
			return "XSSF";
		}
		if (fileName.toLowerCase().endsWith("xls")) {
			return "HSSF";
		}
		throw new RuntimeException("Nome file non valido: " + fileName  + ". Deve avere estensione .xlsx o .xls");
	}
	
	
	private void writeCell(Cell cell, Object value) {
		if (value == null){
			// niente
		} else
		if (value instanceof Number){
			cell.setCellValue(((Number)value).doubleValue());
		} else
		if (value instanceof Date){
			cell.setCellValue((Date)value);
		} else
		if (value instanceof Calendar){
			cell.setCellValue((Calendar)value);
		} else
		if (value instanceof Boolean){
			cell.setCellValue((Boolean)value);
		} else	
		if (value instanceof String){
			cell.setCellValue((String)value);
			CellStyle cellStyle = workbook.createCellStyle();
			cellStyle.setDataFormat(createHelper.createDataFormat().getFormat("General"));
			cell.setCellStyle(cellStyle);
		} else {
			throw new RuntimeException("Tipo non supportoato " + value.getClass());
		}
	}

}


