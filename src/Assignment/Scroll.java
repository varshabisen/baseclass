package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\varsha\\Selenium\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		Actions act=new Actions(driver);
		Thread.sleep(1000);
		act.scrollByAmount(200, 300);
		Thread.sleep(1000);
		act.scrollByAmount(90, 600);
		Thread.sleep(1000);
		act.scrollByAmount(40, -200);

	}

}
