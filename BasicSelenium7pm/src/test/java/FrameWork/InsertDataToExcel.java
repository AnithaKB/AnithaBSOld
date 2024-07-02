package FrameWork;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class InsertDataToExcel {

	public static void main(String[] args) throws Throwable {
		//Step-1 Path connection
	    FileInputStream fis = new FileInputStream("./TestData.xlsx");
	    
	    //Step-2 excel sheet in read mode
	    Workbook book = WorkbookFactory.create(fis);
	    
	    // Step-3 Control on the sheet
	    Sheet sheet = book.getSheet("Sheet1");
	    
	    Row row = sheet.createRow(2);
	    
	    Cell cell = row.createCell(2);
	    
	    cell.setCellValue("TestYantra");
	    
	    // Excel in Write mode
	    FileOutputStream fos = new FileOutputStream("./TestData.xlsx");
	    book.write(fos);
	    book.close();

	}

}
