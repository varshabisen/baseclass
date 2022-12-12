package NeostoxTestClass;

import org.testng.annotations.Test;

import NeoStoxUtility.Utility;
import NeostoxBase.Base;
import NeostoxPOM.HomePage;
import NeostoxPOM.PasswordPage;
import NeostoxPOM.loginPage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.bouncycastle.asn1.bc.PbkdMacIntegrityCheck;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class ValidateUsername extends Base{
	loginPage login;
	PasswordPage password;
	HomePage home;
	
  @BeforeClass
  public void launchingNeostox() {
	  launchBrowser();
	  login=new loginPage(driver);
	  password=new PasswordPage(driver);
	  home=new HomePage(driver);
	  }
  
  @BeforeMethod
  public void loginToNeostox() throws EncryptedDocumentException, IOException, InterruptedException {
	  login.sendMobileNum(driver,Utility.readDataFromExcel(1, 0));
	  login.clickOnSignInButton(driver);
	  Thread.sleep(1000);
	  password.sendingPassword(driver, "2222");
	  password.clickingOnSubmitButton(driver);
	  Thread.sleep(1000);
	  home.popUpHandle(driver);
  }
  
  
  @AfterMethod
  public void logout()
  {
  home.logoutFromNeoStoxAccount(driver);
  }
  @AfterClass
  public void closeApplication() throws InterruptedException
  {
  closeBrowser(driver);
  }


}
