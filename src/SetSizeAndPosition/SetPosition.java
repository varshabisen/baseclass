package SetSizeAndPosition;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\varsha\\Selenium\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com");
		Thread.sleep(1000);
		Point defaultPosition = driver.manage().window().getPosition();
		System.out.println(defaultPosition);
		Thread.sleep(1000);
		Point p=new Point(100, 500);
		driver.manage().window().setPosition(p);
	}

}
