package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class NewTest {
  @Test
  public void validatepin() {
	  Reporter.log("pin validation done-->@Test used",true);
  }
  @Test
  public void validateUserID() {
	  Reporter.log("UserID validation done-->@Test used",true);
  }
  @BeforeMethod
  public void EnterUSDNPWD() {
	  Reporter.log("UserID And Password entered-->@BeforeMethod used",true);
  }

  @AfterMethod
  public void Logout() {
	  Reporter.log("logout done-->@AfterMethod used",true);
  }

  @BeforeClass
  public void launchBrowser() {
	  Reporter.log("browser is launched-->@BeforeClass used",true);
  }

  @AfterClass
  public void CloseBrowser() {
	  Reporter.log("browser is closed-->@AfterClass used",true);
  }

}
