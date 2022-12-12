package excel_study;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel6 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myFile=new File("D:\\varsha\\Selenium\\mysheet.xlsx");
		 Sheet mysheet = WorkbookFactory.create(myFile).getSheet("Sheet4");
              int totalNumOfRows = mysheet.getLastRowNum();
               int totalNumOfCell = mysheet.getRow(0).getLastCellNum()-1;
               
               for(int i=0;i<=totalNumOfRows;i++) {
            	   for(int j=0;j<=totalNumOfCell;j++) {
            		   CellType CellDataType = mysheet.getRow(i).getCell(j).getCellType();
                    	if(CellDataType==CellType.STRING) {
                    		String value1 = mysheet.getRow(i).getCell(j).getStringCellValue();
                    	System.out.print(value1+" ");
                    	
                    	}
                    	else if(CellDataType==CellType.NUMERIC) {
                    		 double value2 = mysheet.getRow(i).getCell(j).getNumericCellValue();
                        	System.out.print(value2+" ");
                    	}
                    	else if (CellDataType==CellType.BOOLEAN) {
                    		boolean value3 = mysheet.getRow(i).getCell(j).getBooleanCellValue();
                        	System.out.print(value3+" ");
                    		}
                    	else if(CellDataType==CellType._NONE) {}
                    	
                    	
            	   }
                    	System.out.println();
            	   
            	   
            	   }
               }
	}


