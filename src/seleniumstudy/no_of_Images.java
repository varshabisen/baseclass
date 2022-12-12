package seleniumstudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class no_of_Images {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\varsha\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		driver.findElement(By.name("q")).click();
		Actions act=new Actions(driver);
		Thread.sleep(1000);
		act.sendKeys("iphone 14").sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("//a[text()='Images']")).click();
		Thread.sleep(1000);
		List<WebElement> imgn = driver.findElements(By.tagName("img"));
		System.out.println(imgn.size());
		

	}

}
