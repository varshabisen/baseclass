package seleniumstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\varsha\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		WebElement hide_button=driver.findElement(By.id("hide-textbox"));
		//hide_button.click();
		Thread.sleep(1000);
		WebElement show_button=driver.findElement(By.id("show-textbox"));
		//show_button.click();
		Thread.sleep(1000);
		WebElement textbox_dispayed=driver.findElement(By.id("displayed-text"));
		boolean result=textbox_dispayed.isDisplayed();
		
		if(textbox_dispayed.isDisplayed()) {
			textbox_dispayed.sendKeys("active textbox");
			Thread.sleep(1000);
		}
		else {
			show_button.click();
			textbox_dispayed.sendKeys("deactivate textbox");
		}
		
				}

}
