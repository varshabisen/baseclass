package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class IncludeMethods {
  @Test
  public void TC1() {
	  Reporter.log("TC1 is running",true);
  }
  @Test
  public void TC2() {
	  Reporter.log("TC2 is running",true);
  }
  @Test
  public void TC3() {
	  Reporter.log("TC3 is running",true);
  }
  @Test
  public void TC4() {
	  Reporter.log("TC4 is running",true);
  }
  @Test
  public void TC5() {
	  Reporter.log("TC5 is running",true);
  }
}
