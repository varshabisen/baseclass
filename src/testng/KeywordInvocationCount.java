package testng;

import org.testng.annotations.Test;

import java.awt.event.InvocationEvent;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;

public class KeywordInvocationCount {
  @Test(invocationCount = 5)
  public void TC1() {
	  Reporter.log("TC1 is running",true);
  }
  @BeforeMethod
  public void before() {
	  Reporter.log("before method is running",true);
  }

}
