package POMusingExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxLogin {
	//variable declaration
	  @FindBy(name="userId") private WebElement userid;
	  @FindBy(name ="password")private WebElement password;
	  @FindBy(id ="submit-btn")private WebElement signinto_button;
	  @FindBy(id ="yob")private WebElement yob;
	  
	  //initialize using constructor-->uses-->pageFactory class-->(method)-->initElements
		public UpstoxLogin(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		//usage
		

		public void enterUserId(String un) {
			
			userid.sendKeys(un);
		}
		public void enterPassword(String pwd) {
			password.sendKeys(pwd);
		}
		public void signin() {
			signinto_button.click();
		}
		
}
