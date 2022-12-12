package Scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollIntoView {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\varsha\\Selenium\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement AlertName = driver.findElement(By.id("name"));
         AlertName.sendKeys("Varsha");
         Thread.sleep(1000);
         JavascriptExecutor js = ((JavascriptExecutor)driver);
         js.executeScript("arguments[0].scrollIntoView(true);",AlertName);
	}

}
