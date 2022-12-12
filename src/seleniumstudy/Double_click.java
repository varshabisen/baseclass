package seleniumstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_click {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\varsha\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(1000);
		Actions act=new Actions(driver);
		Thread.sleep(1000);
		WebElement d_click=driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		//act.moveToElement(double_click).perform();
		
		act.moveToElement(d_click).build().perform();
		act.doubleClick().perform();
		
	}

}
