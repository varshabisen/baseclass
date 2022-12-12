package seleniumstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\varsha\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.phonepe.com/");
		//driver.manage().window().maximize();
		//Thread.sleep(2000);
		//driver.manage().window().minimize();
		/*driver.navigate().to("https://www.myntra.com/shop/women");
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		driver.navigate().refresh();*/
		//driver.getTitle();
		
		System.out.println(driver.getTitle());
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		
		
		
		
		
		
		
	}

}
