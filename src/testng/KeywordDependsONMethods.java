package testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class KeywordDependsONMethods {
  @Test
  public void VerifyPin() {
	  Reporter.log("pin is verified",true);
  }
  @Test
  public void login() {
	  Reporter.log("login done",true);
	  Assert.fail();
  }
  @Test
  public void EnterUDNPWD() {
	  Reporter.log("UDNPWD Entered",true);
  }
  @Test(dependsOnMethods = "login")
  public void logout() {
	  Reporter.log("logout done",true);
  }
}
