package UpstoxPOMUsingExcel;

import org.testng.annotations.Test;

import POM.UpstoxHome;
import POM.UpstoxLogin;
import POM.UpstoxPasscode;
import POM.UpstoxWelcomePage;
import commonMethods.GeneralMethods;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class UpstoxPOMUsingTestNG {
	UpstoxLogin login;
	UpstoxPasscode passcode;
	UpstoxWelcomePage welcome;
	UpstoxHome home;
	
	Sheet mySheet;
	WebDriver driver;

  @BeforeClass
  public void LaunchBrowser() throws InterruptedException, EncryptedDocumentException, IOException {
	  System.setProperty("webdriver.chrome.driver","D:\\varsha\\selenium jar\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
      driver.manage().window().maximize();
		driver.get("https://login-v2.upstox.com/");
        Thread.sleep(1000);
        Reporter.log("launching browser",true);
        
        login=new UpstoxLogin(driver);
        passcode=new UpstoxPasscode(driver);
        welcome=new UpstoxWelcomePage(driver);
        home=new UpstoxHome(driver);
        
        File myfile = new File("D:\\UPSTOX LOGIN.xlsx");
        mySheet= WorkbookFactory.create(myfile).getSheet("Sheet1");
        GeneralMethods.waitTest(driver, 1000);
        
        }
  
  @BeforeMethod
  public void LoginToUpatox() throws InterruptedException {
	  login.enterUserId(mySheet.getRow(0).getCell(0).getStringCellValue());
	  login.enterPassword(mySheet.getRow(0).getCell(1).getStringCellValue());
	  login.signin();
	  Reporter.log("Sending userID and Password",true);
	  GeneralMethods.waitTest(driver, 1000);
	  
	  passcode.enterPasscode();
	  Reporter.log("Sending Passcode",true);
	  GeneralMethods.waitTest(driver, 7000);
	  welcome.clicknoImGoodbutton();
	  Reporter.log("clickingomimgoodbutton",true);
	  GeneralMethods.waitTest(driver, 5000);
	  home.checkAvailableFunds();
	  Reporter.log("cheking available funds",true);
	  GeneralMethods.waitTest(driver, 2000);
	  home.clickOnFunds();
	  Reporter.log("clicking on funds",true);
	  GeneralMethods.waitTest(driver, 2000);


  }
  
  @Test
  public void validateUIDnPWD() throws IOException, InterruptedException {
	  String expectedUID=mySheet.getRow(0).getCell(0).getStringCellValue();
	  String actualUID= home.getActualUserID(driver);
	  Assert.assertEquals(actualUID, expectedUID,"Actual UserID is not  equals to Expected UserID TC is failed");
	 Reporter.log("validating userName and taking screenshot",true);
	GeneralMethods.takeScreenshot(driver, actualUID);
  }
  
 // @AfterMethod
 // public void Logout() {
 // }

  @AfterClass
  public void CloseBrowser() {
	  driver.close();
	  Reporter.log("closing browser",true);
  }

}
