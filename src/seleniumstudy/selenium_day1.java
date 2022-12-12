package seleniumstudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_day1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\varsha\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://chromedriver.chromium.org/downloads");
		//driver.manage().window().maximize();
		Thread.sleep(1000);
		//driver.manage().window().minimize();
		driver.navigate().to("https://www.myntra.com/");
		//driver.close();
		//driver.quit();
		
		//driver.navigate().back();
		Thread.sleep(2000);
		//driver.navigate().forward();
		//driver.navigate().refresh();
		//driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		String s1=driver.getTitle();
		System.out.println(s1);
		
	}

}
