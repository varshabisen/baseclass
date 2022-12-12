package NeostoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import NeoStoxUtility.Utility;
import NeoStoxUtility.UtilityNew;

public class loginPage {
@FindBy(id="MainContent_signinsignup_txt_mobilenumber")private WebElement mobileNumField;

@FindBy(id="lnk_signup1")private WebElement signInButton;
@FindBy(id="txt_accesspin")private WebElement passwordField;
@FindBy(id="lnk_submitaccesspin")private WebElement SubmitButton;
 
public loginPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
 public void sendMobileNum(WebDriver driver,String mobileNum) {
	 UtilityNew.wait(driver,1000);
	 mobileNumField.sendKeys(mobileNum);
	 Reporter.log("sending mobile Number",true);
	 
 }
 public void clickOnSignInButton(WebDriver driver) {
	 UtilityNew.wait(driver, 1000);
	 signInButton.click();
	 Reporter.log("clicking on sign in button",true);
	 
 }
 
 


}
