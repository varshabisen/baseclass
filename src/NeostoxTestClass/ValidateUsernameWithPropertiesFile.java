package NeostoxTestClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import NeoStoxUtility.Utility;
import NeoStoxUtility.UtilityNew;
import NeostoxBase.BaseNew;
import NeostoxPOM.HomePage;
import NeostoxPOM.PasswordPage;
import NeostoxPOM.loginPage;

public class ValidateUsernameWithPropertiesFile extends BaseNew {

		loginPage login;
		PasswordPage password;
		HomePage home;
		
	  @BeforeClass
	  public void launchingNeostox() throws IOException {
		  launchBrowser();
		  //login=new loginPage(driver);
		  //password=new PasswordPage(driver);
		  //home=new HomePage(driver);
		  }
	  
	  @BeforeMethod
	  public void loginToNeostox() throws EncryptedDocumentException, IOException, InterruptedException {
		  //login.sendMobileNum(driver,UtilityNew.readDataFromPropertyFile("mobnumfield"));
		  //login.clickOnSignInButton(driver);
		  //Thread.sleep(1000);
		  //String pass1=(Utility.readDataFromExcel(1, 1));
		  //password.sendingPassword(driver,UtilityNew.readDataFromPropertyFile("passwordfield"));
		  //password.clickingOnSubmitButton(driver);
		  //Thread.sleep(1000);
		  //home.popUpHandle(driver);
	  }
	  
	  @Test
	  public void ValidateUserName() throws EncryptedDocumentException, IOException {
		  Assert.assertEquals(home.getUserName(), UtilityNew.readDataFromPropertyFile("username"),"TC failed, actual and expected User Names are not matching");
		  Utility.takeScreenshot(driver,home.getUserName());
	 
	  }
	  @AfterMethod
	  public void logout()
	  {
	  home.logoutFromNeoStoxAccount(driver);
	  }
	  @AfterClass
	  public void closeApplication() throws InterruptedException
	  {
	  closingBrowser(driver);
	  }


	}


