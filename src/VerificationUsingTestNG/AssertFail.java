package VerificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertFail {
  @Test
  public void testing() {
	  Assert.fail();
  }
}
