package NeostoxBase;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.bouncycastle.asn1.cmp.ProtectedPart;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import NeoStoxUtility.Utility;

public class Base {
	protected WebDriver driver;
	public void launchBrowser() {
		  System.setProperty("webdriver.chrome.driver","D:\\varsha\\selenium jar\\chromedriver_win32 (1)\\chromedriver.exe");
		    driver=new ChromeDriver();
			driver.get("https://neostox.com/sign-in");
			driver.manage().window().maximize();
			Reporter.log("launching browser",true);
			Utility.wait(driver, 1000);
	}
	public static void closeBrowser(WebDriver driver) throws InterruptedException {
		Reporter.log("closing browser",true);
		Thread.sleep(500);
		driver.close();
		
	}
}
