package Uptox_App;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uptox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\varsha\\Selenium\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://upstox.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.id("txtcontact")).sendKeys("9823655285");
		Thread.sleep(500);
		driver.findElement(By.className("submit-btn")).click(); 
		//driver.findElement(By.id("otpNum")).sendKeys("005804");
		Thread.sleep(500);
	//	driver.findElement(By.id("continueBtn")).click();
		driver.findElement(By.id("pinCode")).sendKeys("");
		
		//JavascriptExecutor js = ((JavascriptExecutor)driver);
	}

}
