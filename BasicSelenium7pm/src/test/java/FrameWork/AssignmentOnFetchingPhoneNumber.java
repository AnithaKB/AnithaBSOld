package FrameWork;

import java.io.FileInputStream;

import javax.swing.text.DateFormatter;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class AssignmentOnFetchingPhoneNumber {

	@Test
	
	public void assignmentOnFetchingPhoneNumber() throws Throwable {
		
		FileInputStream fis = new FileInputStream("./TestData.xlsx");
		 Workbook book = WorkbookFactory.create(fis);
		 Sheet sheet = book.getSheet("Sheet1");
		 Row row = sheet.getRow(4);
		 Cell cell = row.getCell(5);
		 DataFormatter format = new DataFormatter();
		 String excelData = format.formatCellValue(cell);
         System.out.println(excelData);
         
	}

}
