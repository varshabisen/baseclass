package POMusingExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxPasscode {
@FindBy(name="yob")private WebElement passcode;

//variable initialization (constructor-->PageFactory-->Method-->initElements
public UpstoxPasscode(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
//usage
public void enterPasscode(String pass){
	passcode.sendKeys(pass);
}

}
