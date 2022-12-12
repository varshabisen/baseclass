package VerificationUsingTestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEquals {
  @Test
  public void testing() {
	  String a="Varsha R";
	  String b="rani R";
	//I need to verify a and b are equal or not?
	//if a and b are equal TC is passed or TC is failed
	 // if(a.equals(b)) {
	//	  Reporter.log("Tc is passed when a & b are equal");
	 // }
	  //else {
	//	  Reporter.log("Tc is failed when a & b are not equal");
	 // }
	  Assert.assertEquals(a,b,"TC is Failed when a & b are not equal");
  }
}
