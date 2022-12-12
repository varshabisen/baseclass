package POM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestUp {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","D:\\varsha\\selenium jar\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://login-v2.upstox.com/");
          Thread.sleep(1000);
        //create an object of POM class
          UpstoxLogin login=new UpstoxLogin(driver);
          login.enterUserId(null);
          login.enterPassword(null);
          login.signin();
        //create an object of upstoxPasscode class
          Thread.sleep(3000);
          UpstoxPasscode code=new UpstoxPasscode(driver);
          code.enterPasscode();
          //create an object of upstoxWelcomePage class
          Thread.sleep(6000);
          UpstoxWelcomePage page=new UpstoxWelcomePage(driver);
          page.clicknoImGoodbutton();
          //create an object of upstoxHomePage class
          Thread.sleep(5000);
          UpstoxHome home=new UpstoxHome(driver);
          home.validateUserID(driver);
          home.clickOnFunds();
          //create an object of upstoxHomePage class
          Thread.sleep(5000);
          
          home.checkAvailableFunds();
          Thread.sleep(1000);
          home.logoutFromApplication();
          driver.close();
	}

}
