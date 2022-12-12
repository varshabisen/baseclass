package POMusingExcel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestUp {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","D:\\varsha\\selenium jar\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://login-v2.upstox.com/");
          Thread.sleep(1000);
     
          //reading data from excel
         File myfile = new File("D:\\UPSTOX LOGIN.xlsx");
         Sheet mySheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
         
       //create an object of login POM class
         UpstoxLogin login=new UpstoxLogin(driver);
         
         login.enterUserId(mySheet.getRow(0).getCell(0).getStringCellValue());
         String pwd1 = mySheet.getRow(0).getCell(1).getStringCellValue();
         login.enterPassword(pwd1);
         login.signin();
        //create an object of upstoxPasscode class
          Thread.sleep(3000);
          UpstoxPasscode code=new UpstoxPasscode(driver);
          code.enterPasscode(mySheet.getRow(0).getCell(2).getStringCellValue());
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
