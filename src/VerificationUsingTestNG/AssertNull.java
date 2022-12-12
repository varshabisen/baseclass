package VerificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNull {
  @Test
  public void testing() {
	  String a="gh";
	//TC should be passed if a is null
Assert.assertNull(a,"TC failed when value of a is not null");
  }
}
