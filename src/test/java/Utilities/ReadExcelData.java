package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {
	
	
	
	public static Object[][] readdata(String filename, int sheetindex) throws IOException{
		
		File f = new File(filename);
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook myWorkbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = myWorkbook.getSheetAt(sheetindex);
		int totr = sheet.getLastRowNum();
		int totc = sheet.getRow(0).getLastCellNum();
		
		Object arr [][] = new Object[totr][totc];
				
		for (int i = 0; i < totr; i++) {
			
			for (int j = 0; j < totc; j++) {
			
				arr[i][j]=(sheet.getRow(i+1).getCell(j).getStringCellValue());
			}
			
			
		}
		
		return arr;
		
	}

}
