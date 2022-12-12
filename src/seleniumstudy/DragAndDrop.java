package seleniumstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\varsha\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(1000);
		WebElement rs_drag = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		Thread.sleep(1000);
		WebElement amt_drop = driver.findElement(By.id("shoppingCart4"));
		Thread.sleep(1000);
		Actions act = new Actions(driver);
		Thread.sleep(1000);
		act.dragAndDrop(rs_drag, amt_drop).perform();
		// act.moveToElement(amt_drop).clickAndHold(amt_drop).click().perform();
		WebElement source = driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		Thread.sleep(1000);
		WebElement destination = driver.findElement(By.className("shoppingCart"));
		Thread.sleep(1000);
		act.dragAndDrop(source, destination).perform();

	}

}
