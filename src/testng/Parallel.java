package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Parallel {
  @Test
  public void kiteLogin() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","D:\\varsha\\selenium jar\\chromedriver_win32 (1)\\chromedriver.exe" );
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
		Reporter.log("kite launch",true);
		Thread.sleep(2000);
		driver.close();
  }
}
