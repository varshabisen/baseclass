package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ExcludeMethods {
  @Test
  public void TC7() {
	  Reporter.log("TC7 is running",true);
  }
  @Test
  public void TC8() {
	  Reporter.log("TC8 is running",true);
  }
  @Test
  public void TC9() {
	  Reporter.log("TC9 is running",true);
  }
  @Test
  public void TC10() {
	  Reporter.log("TC10 is running",true);
  }
  
}
