package SoftAssert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class FirefoxTest {
  @Test
  public void testing() throws InterruptedException {
	  System.setProperty("webdriver.ie.driver","D:\\varsha\\selenium jar\\IEDriverServer_Win32_4.3.0\\IEdriver.exe");
		WebDriver driver=new InternetExplorerDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
  }
}
