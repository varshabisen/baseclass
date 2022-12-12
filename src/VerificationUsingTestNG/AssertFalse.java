package VerificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertFalse {
  @Test
  public void testing() {
	  boolean a=true;
	  Assert.assertFalse(a,"TC failed when value of a is true");
	  
  }
}
