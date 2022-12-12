package VerificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrue {
  @Test
  public void testing() {
	  boolean a=true;
	  Assert.assertTrue(a,"Tc failed when value of a is false");
  }
}
