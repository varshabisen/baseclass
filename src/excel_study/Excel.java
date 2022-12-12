package excel_study;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel {

	public static void main(String[] args) throws  EncryptedDocumentException, IOException {
		  File myFile=new File("D:\\varsha\\Selenium\\mysheet.xlsx");
		  String value = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
          System.out.println(value);
          
          double value2 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(1).getNumericCellValue();
	     System.out.println(value2);
	     
	   // boolean value3 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(0).getCell(2).getBooleanCellValue();
	     // System.out.println(value3);
	      String value4 = WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
	System.out.println(value4);
	}

	
}