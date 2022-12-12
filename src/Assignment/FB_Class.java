package Assignment;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FB_Class {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\varsha\\selenium jar\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login.php");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Forgotten account?")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("priyar12@gmail.com");
		Thread.sleep(500);
		driver.findElement(By.name("pass")).sendKeys("priya@12");
		Thread.sleep(500);
		driver.findElement(By.xpath("(//span[text()='Log in'])[2]")).click();
		Thread.sleep(500);
		WebElement popup = driver.findElement(By.className("_9ai6 img sp_vxiiSmFDFzJ_2x sx_4ab28a"));
		Thread.sleep(500);
		Alert alt = driver.switchTo().alert();
		alt.dismiss();
		Thread.sleep(500);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(500);
		driver.findElement(By.name("firstname")).sendKeys("ram");
		Thread.sleep(500);
		driver.findElement(By.name("lastname")).sendKeys("jain");
		Thread.sleep(500);
		driver.findElement(By.name("reg_email__")).sendKeys("9867543590");
		Thread.sleep(500);
		driver.findElement(By.id("password_step_input")).sendKeys("ram@12");
		Thread.sleep(500);
		WebElement day = driver.findElement(By.name("birthday_day"));
		Thread.sleep(500);
		day.click();
		Select s = new Select(day);
		s.selectByVisibleText("15");
		Thread.sleep(500);
		WebElement month = driver.findElement(By.id("month"));
		month.click();
		Select s1 = new Select(month);
		s1.selectByValue("3");
		WebElement year = driver.findElement(By.name("birthday_year"));
		year.click();
		Select s2 = new Select(year);
		s2.selectByValue("2020");
		Thread.sleep(500);
		WebElement radioButton = driver.findElement(By.name("sex"));
		radioButton.click();
		Thread.sleep(500);
		// driver.findElement(By.name("websubmit")).click();

	}
}
