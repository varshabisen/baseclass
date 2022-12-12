package NeoStoxUtility;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

import net.bytebuddy.utility.RandomString;

public class Utility {
	//common methods
			// excel data,scrolling,screenshot,wait

	

	public static void readDataFromExcel(int row, int cell) 
	
	{
		try {
			File myFile= new File("D:\\varsha\\NeostoxSheet.xlsx");
		
			Sheet mysheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
			String value = mysheet.getRow(row).getCell(cell).getStringCellValue();
			//System.out.println(value);
			//Reporter.log("entering data from excel", true);
			//return value;
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		//return null;
	
	}
	public static void takeScreenshot(WebDriver driver,String filename) throws IOException {
		try {
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			System.out.println(src);
			String st=RandomString.make(3);
			System.out.println(st);
			
			File dest=new File("D:\\varsha\\Selenium\\test.png");
			FileHandler.copy(src, dest);
			Reporter.log("taking screenshot",true);
		} catch (Exception e) {
			System.out.println(e);
		}
		
				
}
	public static void ScrollIntoView(WebDriver driver,WebElement element) {
		JavascriptExecutor js=((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true)",element);
		Reporter.log("scrolling into view "+element.getText(),true);
	
		}
	public static void wait(WebDriver driver,int waittime) {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waittime));
		Reporter.log("waiting for "+waittime+"milis",true);

		
	}
	
	}


