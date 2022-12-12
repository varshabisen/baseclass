package seleniumstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\varsha\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		WebElement checkbox1=driver.findElement(By.id("checkBoxOption1"));
		boolean result =checkbox1.isSelected();
		System.out.println("checkbox1 status is : "+result);
		checkbox1.click();
		boolean result1 =checkbox1.isSelected();
		System.out.println("checkbox2 status is : "+result1);
		
	}

}
