package selenium_practiceLink;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class links {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\varsha\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		Thread.sleep(500);
		driver.findElement(By.id("item-5")).click();
		Thread.sleep(500);
	    //driver.findElement(By.linkText("Home")).click();
	   // Thread.sleep(500);
	   driver.findElement(By.linkText("Created")).click();
	   Thread.sleep(1000);
	   driver.findElement(By.linkText("No Content")).click();
	   Thread.sleep(1000);
	   driver.findElement(By.linkText("Moved")).click();
	   Thread.sleep(1000);
	   driver.findElement(By.linkText("Bad Request")).click();
	   Thread.sleep(1000);
	   driver.findElement(By.linkText("Unauthorized")).click();
	   Thread.sleep(1000);
	   driver.findElement(By.linkText("Forbidden")).click();
	   Thread.sleep(1000);
	   driver.findElement(By.linkText("Not Found")).click();
	}

}
