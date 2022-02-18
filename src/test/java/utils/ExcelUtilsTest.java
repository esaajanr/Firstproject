package utils;

public class ExcelUtilsTest {

	public static void main(String[] args) {
		
		String excelPath = "./data_excel/TestData.xls";
		String sheetName = "Sheet1";
		ExcelUtils exl = new ExcelUtils(excelPath, sheetName);

		exl.getRowCount();
		exl.getCellCount(2, 0);
		exl.getCellCount(2, 1);
		exl.getCellCount(2, 2);
	}

}
