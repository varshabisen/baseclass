package excel_study;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WorksheetFactory {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myFile=new File("D:\\varsha\\Selenium\\mysheet.xlsx");
		Workbook myWorkbook = WorkbookFactory.create(myFile);
        Sheet mysheet = myWorkbook.getSheet("Sheet1");
        Row myRow= mysheet.getRow(0);
        Cell mycell = myRow.getCell(2);
        CellType cellDataType = mycell.getCellType();
        System.out.println("datatype is: "+cellDataType);
        System.out.println(mycell.getStringCellValue());
        
		                
	}

}
