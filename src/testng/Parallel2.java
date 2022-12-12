package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Parallel2 {
  @Test
  public void Phonepay() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","D:\\varsha\\selenium jar\\chromedriver_win32 (1)\\chromedriver.exe" );
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.phonepe.com/");
		Reporter.log("Phonepay launch",true);
		Thread.sleep(2000);
		driver.close();
  }
}
