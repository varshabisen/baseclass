package VerificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNotEquals {
  @Test
  public void testing() {
	  String a= "Mumbai";
	  String b= "Mumbai";
	  Assert.assertNotEquals(a,b,"Tc is failed when a& b are equal");
	  Reporter.log("Tc failed when a & b are equal",true);
  }
}
