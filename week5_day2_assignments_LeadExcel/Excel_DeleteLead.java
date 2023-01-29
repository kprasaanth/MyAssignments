package week5_day2_assignments;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_DeleteLead {

	public static String[][] excel() throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook("./Data/CreateContact.xlsx");
		XSSFSheet ws = wb.getSheet("Sheet4");
		int rowCount = ws.getLastRowNum();
		int ColmCount = ws.getRow(0).getLastCellNum();
		String[][] data = new String[rowCount][ColmCount];
		for (int i = 1; i <= rowCount; i++) {
			for (int j = 0; j < ColmCount; j++) {
				String cellValue = ws.getRow(i).getCell(j).getStringCellValue();
				data[i-1][j] = cellValue;
			}
			
		}
		wb.close();
		return data;
	}
	
}
