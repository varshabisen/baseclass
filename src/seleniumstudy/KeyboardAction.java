package seleniumstudy;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardAction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\varsha\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();;
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		WebElement create_new_ac=driver.findElement(By.xpath("//a[text()='Create New Account']"));
		create_new_ac.click();
		Thread.sleep(1000);
		WebElement month=driver.findElement(By.id("month"));
		Thread.sleep(1000);
		Actions act=new Actions(driver);
		WebElement F_N = driver.findElement(By.name("firstname"));
		act.moveToElement(F_N).keyDown(Keys.SHIFT).sendKeys("b").keyUp(Keys.SHIFT).sendKeys("humen").build().perform();
		act.click(month).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_UP).perform();
		
		Thread.sleep(1000);
//		for(int i=0;i<4;i++) {
//			act.sendKeys(Keys.ARROW_UP).perform();
//			
//		}
//		act.sendKeys(Keys.ENTER).perform();
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(0);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(0);
		
		act.sendKeys(Keys.ARROW_DOWN).perform();
		
	
		
		
		
		
		
}

}
