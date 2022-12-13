
package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickNSendkeysByJSE {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\varsha\\Selenium\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement click_operation = driver.findElement(By.linkText("Start Selenium Practice"));
		Thread.sleep(1000);
		WebElement textbox = driver.findElement(By.id("autocomplete"));
		
		
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].click()",click_operation );
		Thread.sleep(1000);
		js.executeScript("arguments[0].value='India'", textbox);
		
	}

}
