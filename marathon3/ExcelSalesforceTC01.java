package marathon3;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSalesforceTC01 {

	public static String[][] excel() throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook("./Data/SalesForceExcel.xlsx");
		XSSFSheet ws = wb.getSheet("Sheet1");
		int rowCount = ws.getLastRowNum();
		int columCount = ws.getRow(0).getLastCellNum();
		String[][] data = new String[rowCount][columCount];
		for (int i = 1; i <= rowCount; i++) {
			for (int j = 0; j < columCount; j++) {
				String cellValue = ws.getRow(i).getCell(j).getStringCellValue();
				data[i-1][j] = cellValue;
			}	
		}
		wb.close();
		return data;
	}

}
