package excel_study;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STTotalsRowFunction;

public class excel5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myFile=new File("D:\\varsha\\Selenium\\mysheet.xlsx");
		 Sheet mysheet = WorkbookFactory.create(myFile).getSheet("Sheet3");
		 int lastrowNum = mysheet.getLastRowNum();
		 System.out.println("last row is : "+lastrowNum);
		 int totalNumOfRows = lastrowNum;
		 System.out.println("total no. of rows: "+totalNumOfRows);
	
         short lastcellNum = mysheet.getRow(0).getLastCellNum();
         System.out.println("last cell is:"+lastcellNum );
         int totalNumOfCell = lastcellNum-1;
         System.out.println("total cell no. are : "+totalNumOfCell);
         
         for(int i=0;i<=totalNumOfRows;i++) {
        	 for(int j=0;j<=totalNumOfRows;j++) {
        		 String value = mysheet.getRow(i).getCell(j).getStringCellValue();
        		 System.out.print(value+" ");
        	 }
        	 System.out.println();
         }
	}

}
