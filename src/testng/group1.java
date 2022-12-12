package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class group1 {
  @Test(groups="regression")
  public void TC1() {
	  Reporter.log("TC1 regression running",true);
  }
  @Test(groups="sanity")
  public void TC2() {
	  Reporter.log("TC2 sanity running",true);
  }
  @Test(groups="regression")
  public void TC3() {
	  Reporter.log("TC3 regression running",true);
  }
  @Test(groups="sanity")
  public void TC4() {
	  Reporter.log("TC4 sanity running",true);
  }
  @Test(groups="regression")
  public void TC5() {
	  Reporter.log("TC5 regression running",true);
  }
  @Test(groups="sanity")
  public void TC6() {
	  Reporter.log("TC6 sanity running",true);
  }
  @Test(groups="regression")
  public void TC7() {
	  Reporter.log("TC7 regression running",true);
  }
}
