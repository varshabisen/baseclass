package seleniumstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\varsha\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjYzODQ4NDgxLCJjYWxsc2l0ZV9pZCI6MjY5NTQ4NDUzMDcyMDk1MX0%3D");
	//driver.findElement(By.id("email")).sendKeys("vsrahangdale15@gmail.com");
	//driver.findElement(By.id("pass")).sendKeys("Varsha_12345");
//	driver.findElement(By.id("loginbutton")).click();
driver.findElement(By.id("email")).sendKeys("vsrahangdale15@gmail.com");




	}

}
