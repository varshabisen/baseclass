package excel_study;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelEG3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myFile=new File("D:\\varsha\\Selenium\\mysheet.xlsx");
		 Sheet mysheet = WorkbookFactory.create(myFile).getSheet("Sheet2");
		 //how to read single row
		 for(int i=0;i<=4;i++) {
			String value1= mysheet.getRow(0).getCell(i).getStringCellValue();
		
		 System.out.print(value1+"");
		 
		 }
       System.out.println();
       System.out.println("==================================");
       
       //how to read cell/column
       for(int j=0;j<=5;j++) {
    	   String value2 = mysheet.getRow(j).getCell(0).getStringCellValue();
    	   System.out.println(value2);
       }
       System.out.println();
    		
	}

}
