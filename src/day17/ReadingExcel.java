package day17;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("/Users/denyskurakov/Desktop/data.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rows=sheet.getLastRowNum();
		int cols=sheet.getRow(0).getLastCellNum();
		System.out.println("Number of rows:  "+rows);
		System.out.println("Number of columns:  "+cols);
		
		for(int i=1; i<=rows; i++) {
			
			XSSFRow row=sheet.getRow(i);
			for(int j=0;j<cols; j++) {
				DataFormatter formatter = new DataFormatter();
				String celldata=formatter.formatCellValue(row.getCell(j));
				System.out.print(celldata+"\t");
			}
			System.out.println();
		}
		
		
	}

}
