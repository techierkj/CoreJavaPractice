package excelPackage;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelRead {

	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static XSSFRow row;
	static XSSFCell cell;

	@Test
	public static void excelRead() throws IOException {

		FileInputStream file = new FileInputStream("C:\\CPQ_Test_Data.xlsx");
		workbook = new XSSFWorkbook(file);

		// Get Sheet count
		int sheetCount = workbook.getNumberOfSheets();
		System.out.println("Sheets Present:- " + sheetCount);

		// Print All sheets name present in excel
		for (int i = 0; i < sheetCount; i++) {
			String sheetName = workbook.getSheetName(i);
			System.out.println("Sheet Name at location " + i + " is :" + sheetName);
		}

		// Get Sheet at 0th Location
		sheet = workbook.getSheetAt(0);

		// Get Row count in a particular Sheet
		int rowCount = sheet.getLastRowNum();
		System.out.println("Row Count" + rowCount + 1);
		
		
		// Now Opensheet (SITCredentials) , get Row

	}
}
