package DynamicWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\varsha\\selenium jar\\chromedriver_win32 (1)\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		WebElement checkbox1=driver.findElement(By.id("checkBoxOption1"));
		checkbox1.click();

	}

}
