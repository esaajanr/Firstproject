package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
//	static XSSFWorkbook workbook;
//	static XSSFSheet sheet;
	
	static HSSFWorkbook workbook;
	static HSSFSheet sheet;
	
	public ExcelUtils(String excelPath, String sheetName) {
		
		//String projectDir = System.getProperty("user.dir");
//		System.out.println(projectDir);
//			
//		String excelPath = "./data_excel/TestData.xlsx";
		try {
			
			InputStream file = new FileInputStream(excelPath);
			
//			workbook = new HSSFWorkbook();
//			sheet = workbook.getSheet(sheetName);
					
			workbook = new HSSFWorkbook(new POIFSFileSystem(file));
			sheet = workbook.getSheet(sheetName);
			
		}catch (Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.getStackTrace();
		}
		}
	
	public static void getCellCount(int rowNum, int colNum) {
			
				DataFormatter formatter = new DataFormatter();
				Object value = formatter.formatCellValue(sheet.getRow(rowNum).getCell(colNum));
				//double cellValue = sheet.getRow(1).getCell(2).getNumericCellValue();
				System.out.println(value);
		}
			
	public static void getRowCount() {
		
			int rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("No. of Rows : "+rowCount);
		
}}
