package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\varsha\\Selenium\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		Actions act=new Actions(driver);
		Thread.sleep(1000);
		WebElement search = driver.findElement(By.id("search"));
		Thread.sleep(1000);
       search.sendKeys("cartoon");
       Thread.sleep(1000);
       act.scrollToElement(search);
	}

}
