package Scrolling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollby {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\varsha\\Selenium\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		 JavascriptExecutor js = ((JavascriptExecutor)driver);
		 js.executeScript("window.scrollBy(40,190)");
		 Thread.sleep(1000);
		 js.executeScript("window.scrollBy(30,-170)");
		 
		 Thread.sleep(1000);
		 js.executeScript("window.scrollBy(30,20)");
		 

		 Thread.sleep(1000);
		 js.executeScript("window.scrollBy(30,300)");
	}

}
