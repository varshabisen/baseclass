package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class KeywordTimeout {
  @Test
  public void TC1() {
	  Reporter.log("TC1 is running",true);
  }
  @Test
  public void TC2() {
	  Reporter.log("TC2 is running",true);
  }
  @Test(timeOut = 2000)
  public void TC3() throws InterruptedException {
	  Reporter.log("TC3 is running",true);
	  Thread.sleep(3000);
  }
  @Test
  public void TC4() {
	  Reporter.log("TC4 is running",true);
  }
}
