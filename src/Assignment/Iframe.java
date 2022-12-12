package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\varsha\\selenium jar\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
		Thread.sleep(1000);
		driver.switchTo().frame("frame2");
		Thread.sleep(500);
		WebElement sample = driver.findElement(By.id("sampleHeading"));
		System.out.println(sample.getText());
		Thread.sleep(500);
		WebElement mainPage = driver.findElement(By.className("main-header"));
		Thread.sleep(500);
		System.out.println(mainPage.getText());
		Thread.sleep(500);
		driver.switchTo().defaultContent();
		
	}

}
