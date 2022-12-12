package selenium_practiceLink;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class orangeHRM {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\varsha\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com");
          Thread.sleep(1000);
          WebElement UN = driver.findElement(By.name("username"));
          UN.sendKeys("Admin");
          WebElement PWD = driver.findElement(By.name("password"));
         PWD.sendKeys("admin123");
         WebElement login = driver.findElement(By.xpath(" //button[@type='submit']"));
	      login.click();
	      Thread.sleep(1000);
	      WebElement Admin = driver.findElement(By.xpath("//span[text()='Admin']"));
	     Admin.click();
	     Thread.sleep(500);
	     WebElement Username = driver.findElement(By.xpath("(//input[contains(@class,'oxd-input oxd-in')])[2]"));
	     Username.sendKeys("admin");
	     Thread.sleep(500);
	     WebElement role = driver.findElement(By.className("(//div['oxd-select-text--after'])[1]"));
	     role.click();
	     Select s=new Select(role);
	     s.deselectByVisibleText("ESS");
	     
	     
	
	}
	
	
	
	

}
