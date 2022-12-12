package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class message {
  @Test
  public void displayM() {
	  Reporter.log("all test cases completed",true);
  }
}
