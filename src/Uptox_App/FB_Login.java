package Uptox_App;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_Login {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","D:\\varsha\\Selenium\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/?");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		File myfile=new File("D:\\varsha\\New Microsoft Excel Worksheet.xlsx");
	      Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		
		String un = mySheet.getRow(0).getCell(0).getStringCellValue();
		
		
		driver.findElement(By.id("email")).sendKeys(un);
		Thread.sleep(500);
		driver.findElement(By.id("pass")).sendKeys(mySheet.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(500);
		driver.findElement(By.id("loginbutton")).click();
		driver.findElement(By.xpath("(//span[text()='Confirm'])[1]")).click();
				

	}

}
