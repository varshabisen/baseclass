package seleniumstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\varsha\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
		Thread.sleep(1000);
		driver.switchTo().frame("frame1");
		WebElement sample = driver.findElement(By.id("sampleHeading"));
		System.out.println(sample.getText());
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		//Thread.sleep(1000);
		WebElement mainpage = driver.findElement(By.className("main-header"));
		System.out.println(mainpage.getText());
	
		
		


	}

}
