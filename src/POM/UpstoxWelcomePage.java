package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpstoxWelcomePage {
@FindBy(xpath ="//div[text()='No, I’m good']")private WebElement noImGoodbutton;

public UpstoxWelcomePage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public void clicknoImGoodbutton() throws InterruptedException {
	Thread.sleep(1000);
	noImGoodbutton.click();
	
	
}
}





