package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class group2 {
  @Test(groups = "regression")
  public void TC8() {
	  Reporter.log("TC8 regression running",true);
  }
  @Test(groups = "sanity")
  public void TC9() {
	  Reporter.log("TC9 sanity running",true);
  }
  @Test(groups = "regression")
  public void TC10() {
	  Reporter.log("TC10s regression running",true);
  }
}
