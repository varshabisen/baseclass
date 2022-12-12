package NeostoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import NeoStoxUtility.Utility;
import NeoStoxUtility.UtilityNew;

public class PasswordPage {
	@FindBy(id="txt_accesspin")private WebElement passwordField;
	@FindBy(id="lnk_submitaccesspin")private WebElement SubmitButton;
	
	public PasswordPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void sendingPassword(WebDriver driver,String pass) {
		UtilityNew.wait(driver, 1000);
		CharSequence s = "2222";
		passwordField.sendKeys("674674567567");
		Reporter.log("sending password",true);
	}
	public void clickingOnSubmitButton(WebDriver driver) {
		UtilityNew.wait(driver, 1000);
		SubmitButton.click();
		Reporter.log("clicking on submit button",true);
	}
	

}
