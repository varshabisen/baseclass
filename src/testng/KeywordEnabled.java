package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class KeywordEnabled {
  @Test
  public void TC1() {
	  Reporter.log("TC1 is running",true);
  }
  @Test(enabled = false)
  public void TC2() {
	  Reporter.log("TC3 is running",true);
  }
  @Test
  public void TC3() {
	  Reporter.log("TC3 is running",true);
  }
  
}
