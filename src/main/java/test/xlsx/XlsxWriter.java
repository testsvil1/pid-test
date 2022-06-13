package test.xlsx;

import java.io.FileOutputStream;
import java.util.Calendar;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.ConditionalFormattingRule;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IgnoredErrorType;
import org.apache.poi.ss.usermodel.PatternFormatting;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.SheetConditionalFormatting;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.DefaultIndexedColorMap;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XlsxWriter {

    String fileName;
    String sheetName;
    Workbook workbook;
    CreationHelper createHelper;
    Sheet sheet;
    int rowCount = 0;

	
	public XlsxWriter(String fileName) {
		this.fileName = fileName;
		this.sheetName = null;
	}
	
	public XlsxWriter(String fileName, String sheetName) {
		this.fileName = fileName;
		this.sheetName = sheetName;
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
		addConditionalFormatting();
		addIgnoreError();
		autosizeColumns();
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
		} else {
			throw new RuntimeException("Tipo non supportoato " + value.getClass());
		}
	}
	
	
	public void addheader(String[] header) {
		write(header);
		XSSFCellStyle cellStyle = (XSSFCellStyle)workbook.createCellStyle();
		cellStyle.setFillForegroundColor(new XSSFColor(new java.awt.Color(128, 128, 128), new DefaultIndexedColorMap()));
		cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		XSSFFont font = (XSSFFont)workbook.createFont();
		font.setBold(false);
		font.setFontHeightInPoints((short)(font.getFontHeightInPoints()+3));
		font.setColor(new XSSFColor(new java.awt.Color(255, 255, 255), new DefaultIndexedColorMap()));
		cellStyle.setFont(font);
		//cellStyle.setFillForegroundColor(IndexedColors.WHITE.getIndex());
		for (int i = 0; i <= header.length-1; i++) {
			sheet.getRow(rowCount-1).getCell(i).setCellStyle(cellStyle);
		}
	}
	
	
	private void addConditionalFormatting() {
		SheetConditionalFormatting sheetCF = sheet.getSheetConditionalFormatting();

        ConditionalFormattingRule rule1 = sheetCF.createConditionalFormattingRule("MOD(ROW(),2)");
        PatternFormatting fill1 = rule1.createPatternFormatting();
        fill1.setFillBackgroundColor(new XSSFColor(new java.awt.Color(226, 239, 218), new DefaultIndexedColorMap()));
        
        
        fill1.setFillPattern(PatternFormatting.SOLID_FOREGROUND);

        sheetCF.addConditionalFormatting(new CellRangeAddress[] {getCellRangeAddress()}, rule1); 
	}
	
	
	private void addIgnoreError() {
		((XSSFSheet)sheet).addIgnoredErrors(getCellRangeAddress(), IgnoredErrorType.NUMBER_STORED_AS_TEXT);
	}
	

	private void autosizeColumns() {
		int lastCol = sheet.getRow(0).getLastCellNum()-1;
		for(int i=0; i<lastCol; i++) {
			sheet.autoSizeColumn(i);
		}
	}

	
	private CellRangeAddress getCellRangeAddress() {
		return new CellRangeAddress(1,sheet.getLastRowNum(), 0, sheet.getRow(0).getLastCellNum()-1);
	}

}


