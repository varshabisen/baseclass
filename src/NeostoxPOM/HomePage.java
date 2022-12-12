package NeostoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import NeoStoxUtility.Utility;
import NeoStoxUtility.UtilityNew;

public class HomePage {
	
	@FindBy(xpath = "(//a[text()='OK'])[2]") private WebElement okButton;
	@FindBy(xpath = "(//a[text()='Close'])[5]") private WebElement closeButton;
	@FindBy(id = "lbl_username") private WebElement userName;
	@FindBy(id="lbl_curbalancetop") private WebElement balance;
	@FindBy(id="lnk_logout")private WebElement logoutbutton;
	
	public  HomePage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	public void popUpHandle(WebDriver driver)
	{
//	UtilityNew.wait(driver,1000);
//	okButton.click();
//	UtilityNew.ScrollIntoView(driver, closeButton);
//	UtilityNew.wait(driver, 1000);
//	closeButton.click();
//	Reporter.log("Handeling popup..",true);
	}

	public String getUserName()
	{
	String actualUserName = userName.getText();
	Reporter.log("getting user Name",true);
	return actualUserName;
}
	public String getBalance(WebDriver driver) {
		UtilityNew.wait(driver, 1000);
		String actaulBalance=balance.getText();
		Reporter.log("getting balance",true);
		return actaulBalance;
	}
	public void logoutFromNeoStoxAccount(WebDriver driver) {
		UtilityNew.wait(driver, 1000);

		userName.click();
		UtilityNew.wait(driver, 1000);
		logoutbutton.click();
		Reporter.log("Loggoing out from neoStox",true);
		
	}
}
