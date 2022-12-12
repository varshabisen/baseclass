package selenium_practiceLink;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragNdrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\varsha\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html\r\n"
				+ "");
		Thread.sleep(500);
		
	 WebElement drag = driver.findElement(By.id("box6"));
	 Thread.sleep(500);
	 WebElement drop = driver.findElement(By.xpath("//div[text()='United States']"));
	 Actions act=new Actions(driver);
	 act.dragAndDrop(drag, drop).perform();
	 Thread.sleep(500);
	 WebElement drag1 = driver.findElement(By.id("box2"));
	 Thread.sleep(500);
	 WebElement drop1 = driver.findElement(By.xpath("//div[text()='Italy']"));
	 act.dragAndDrop(drag1, drop1).perform();
	 Thread.sleep(500);
	WebElement drag3 = driver.findElement(By.id("box3"));
	 
	 WebElement drop3 = driver.findElement(By.xpath("//div[text()='Denmark']"));
	 Thread.sleep(500);
	 act.dragAndDrop(drag3, drop3).perform();
		

	}

}