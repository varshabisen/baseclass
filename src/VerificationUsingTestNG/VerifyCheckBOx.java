package VerificationUsingTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class VerifyCheckBOx {
  @Test
  public void Checkbox() {
	  System.setProperty("webdriver.chrome.driver","D:\\varsha\\selenium jar\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		WebElement checkbox1=driver.findElement(By.id("checkBoxOption1"));
		
		if(checkbox1.isSelected()) {
			Reporter.log("Checkbox1 is selected TC is Passed",true);
			
		}
		else {
			Reporter.log("Checkbox1 is not selected TC is failed",true);
		}
		checkbox1.click();
		Assert.assertTrue(checkbox1.isSelected(),"TC is Passed");
  }
}
