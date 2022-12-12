package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class KeywordPriority {
  @Test(priority = 4)
  public void P() {
	  Reporter.log("P is running",true);
  }
  @Test(priority = 1)
  public void Q() {
	  Reporter.log("Q is running",true);
  }
  @Test(priority = 2)
  public void R() {
	  Reporter.log("R is running",true);
  }
  @Test(priority = 3)
  public void S() {
	  Reporter.log("S is running",true);
  }
}
