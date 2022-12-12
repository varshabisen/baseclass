package ChromeOptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.chromium.ChromiumOptions;

public class justdial {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\varsha\\selenium jar\\chromedriver_win32 (1)\\chromedriver.exe" );
		//create object of chrome options
		ChromeOptions opts=new ChromeOptions();
		//opts.addArguments("start-maximized");
		//opts.addArguments("incognito");
	    //opts.addArguments("headless");
		//opts.addArguments("disable-infobar");
		//opts.addArguments("disable-extensions");
		//opts.addArguments("versions");
		//opts.addArguments("disable-popup-blocking");
		opts.addArguments("make-defult-browser");
		
		
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.justdial.com/");
		Thread.sleep(1000);

	}

}
