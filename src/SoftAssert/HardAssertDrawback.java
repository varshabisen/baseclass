package SoftAssert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertDrawback {
  @Test
  public void testing() {
	  String a="abc";
	  String b="abc";
	  String c="abcd";
	  Assert.assertEquals(a,b,"A & B are not equal Tc failed");
	  Assert.assertEquals(b,c,"b & c  are not equal Tc failed");
	  Assert.assertNull(c,"c is not null TC is failed");
  }
}
