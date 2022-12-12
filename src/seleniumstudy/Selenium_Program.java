package seleniumstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Program {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\varsha\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjYzOTg5NjcwLCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D");
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("abc");
		Thread.sleep(1000);
		driver.findElement(By.id("pass")).sendKeys("123");
		Thread.sleep(1000);
		driver.findElement(By.name("login")).click();

	}

}
