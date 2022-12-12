package SetSizeAndPosition;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setsize {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\varsha\\Selenium\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com");
		Thread.sleep(1000);
		Dimension defaultSize = driver.manage().window().getSize();
		System.out.println(defaultSize);
		Dimension d=new Dimension(1050,300);
		Thread.sleep(1000);
		driver.manage().window().setSize(d);

	}

}
