package VerificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotNull {
  @Test
  public void testing() {
	  String a="varsha";
	  Assert.assertNotNull(a,"TC is failed when value of a is null");
  }
}
