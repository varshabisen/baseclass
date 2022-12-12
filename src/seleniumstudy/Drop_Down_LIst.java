package seleniumstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down_LIst {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\varsha\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
	WebElement select_drop_down=driver.findElement(By.id("dropdown-class-example"));
	//create object of select class
	Select s=new Select(select_drop_down);
	//there are 3 methods of select class
		//1.SelectByVisibleText()
		//2.SelectByIndex()
		//3.SelectByValue()
	s.selectByVisibleText("Option2");
	Thread.sleep(1000);
	s.selectByIndex(3);
	Thread.sleep(1000);
	s.selectByValue("option1");

	}

}
