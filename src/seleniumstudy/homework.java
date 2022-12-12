package seleniumstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class homework {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\varsha\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
     	driver.switchTo().frame("iframe-name");
		Thread.sleep(100);
		//current focus is on frame now
		  WebElement about_us = driver.findElement(By.xpath("(//a[text()='About us'])[1]"));
		about_us.click();
		System.out.println(about_us.getText());
	
		driver.switchTo().defaultContent();
		WebElement radio_buttons = driver.findElement(By.xpath("//input[@value='Radio1']"));
	
		radio_buttons.click();
	
	}

     	
	}


