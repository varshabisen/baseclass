package SoftAssert;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertEquals {
	 SoftAssert soft =new SoftAssert();
  @Test
  public void testing() {
	 String a="abc";
	 String b="abcd";
	 String c="abc1";
	soft.assertEquals(a, b,"Tc failed when A & B are not equal");
	 soft.assertEquals(b,c,"Tc failed when B & C are not equal");
	 soft.assertAll();
  }
  @Test
  public void testing1() {
  boolean a=true;
  soft.assertFalse(a,"TC failed when A is true");
  soft.assertNull(a);
 soft.assertAll();
}
}
