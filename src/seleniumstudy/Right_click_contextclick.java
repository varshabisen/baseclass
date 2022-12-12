package seleniumstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_click_contextclick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\varsha\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(1000);
		WebElement right_click=driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions act=new Actions(driver);
	//	act.moveToElement(right_click).contextClick().perform();
	//	act.moveToElement(right_click).perform();
	//	act.contextClick().perform();
		act.contextClick(right_click).build().perform();
		//act.moveToElement(rightClickButton).contextClick().build().perform();
		
		
	}

}
