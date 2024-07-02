package FrameWork;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FetchingDataFromExcel {

	@Test
	public void fetchingDataFromExcel() throws Throwable {
		//Step-1 Path connection
	    FileInputStream fis = new FileInputStream("./TestData.xlsx");
	    
	    //Step-2 excel sheet in read mode
	    Workbook book = WorkbookFactory.create(fis);
	    
	    // Step-3 Control on the sheet
	    Sheet sheet = book.getSheet("Sheet1");
	    
	    // Step-4 Control on the row
	    Row row = sheet.getRow(3);

	    // Step-4 Control on the cell
	    Cell cell = row.getCell(1);
	    
	    String excelData = cell.getStringCellValue();
	    System.out.println(excelData);
	    
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.amazon.in");
	    
	    driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys(excelData);
	    
	}

}
