package POMusingExcel;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import seleniumstudy.Screenshot1;

public class UpstoxHome {

@FindBy(xpath ="//span[text()='varsha r.']")private WebElement userId;
@FindBy(id="funds")private WebElement funds;
@FindBy(xpath = "(//div[@class='_2Bthrplw1VYHfLzzQv0asZ'])[2]") private 
WebElement availableFunds;
@FindBy(id="logout") private WebElement logoutButton;

public UpstoxHome(WebDriver driver) {
	PageFactory.initElements(driver,this);
	
}

public void validateUserID(WebDriver driver) throws InterruptedException, IOException
{
Thread.sleep(1000);
//Scrolling.scrollIntoView(driver, userId);
String actualUserID = userId.getText();
String expectedUserID="varsha r.";
Screenshot1.takescreenshot(driver, "actualUserID "+actualUserID);
if(actualUserID.equalsIgnoreCase(expectedUserID))
{
System.out.println("Actual and Expected UserID are Matching, TC is Passed");
}
else
{
System.out.println("Actual and Expected UserID are not Matching, TC is Failed");

}
}

public void clickOnFunds() {
	funds.click();
}
public void checkAvailableFunds() throws InterruptedException
{
	Thread.sleep(1000);
String myFunds = availableFunds.getText();
System.out.println("Funds available to trade is "+myFunds);
}
public void logoutFromApplication() throws InterruptedException 
{
userId.click();
Thread.sleep(400);
logoutButton.click();


}
}