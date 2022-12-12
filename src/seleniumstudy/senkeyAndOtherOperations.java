package seleniumstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class senkeyAndOtherOperations {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\varsha\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("src")).sendKeys("Nagpur");
		driver.findElement(By.id("src")).clear();
		WebElement fromcity=driver.findElement(By.id("src"));
		fromcity.sendKeys("gondia");
		fromcity.clear();
		fromcity.sendKeys("nagpur");
		//fromcity.sendKeys("pune");
		driver.findElement(By.id("dest")).sendKeys("wakad pune");
		//driver.findElement(By.className("fl icon-calendar_icon-new icon-onward-calendar icon")).sendKeys("sep22");
	//	driver.findElement(By.id("search_btn")).click();
		

	}

}
