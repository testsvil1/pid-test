package test.xlsx;

import java.io.File;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;

public class TestErrorRead {

	
	public static void main(String[] args) {
		try {
			
			String fileName = "EstrazionePID_VT_04032022.xlsx";
			Workbook workbook = WorkbookFactory.create(new File(fileName));
			Sheet sheet = workbook.getSheetAt(0);
			System.out.println(((XSSFSheet)sheet).getIgnoredErrors());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}
	
	
	
}


