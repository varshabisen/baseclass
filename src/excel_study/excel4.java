package excel_study;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myFile=new File("D:\\varsha\\Selenium\\mysheet.xlsx");
		 Sheet mysheet = WorkbookFactory.create(myFile).getSheet("Sheet3");
		 //outer loop for rows vary 0-->1
		 for(int i=0;i<=1;i++) {
			 //inner loop for cell vary 0--->4
		     for(int j=0;j<=4;j++) {
		    	 
		    	 String value = mysheet.getRow(i).getCell(j).getStringCellValue();
		    	 System.out.print(value+" ");
		     } 
		     System.out.println();
		 }
		 

	}

}
