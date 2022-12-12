package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxPasscode {
@FindBy(name="yob")private WebElement passcode;

public UpstoxPasscode(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public void enterPasscode(){
	passcode.sendKeys("1996");
}

}
