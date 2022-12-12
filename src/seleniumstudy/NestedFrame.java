package seleniumstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\varsha\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/nestedframes");
		Thread.sleep(1000);
		WebElement nested_main_frame = driver.findElement(By.className("main-header"));
		System.out.println(nested_main_frame.getText());
		Thread.sleep(1000);
		driver.switchTo().frame("frame1");
		Thread.sleep(1000);
		WebElement parent_frame = driver.findElement(By.xpath("//body[text()='Parent frame']"));
		System.out.println(parent_frame.getText());
		Thread.sleep(1000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']")));
	  Thread.sleep(1000);
		WebElement chiled_frame = driver.findElement(By.xpath("//p[text()='Child Iframe']"));
		System.out.println(chiled_frame.getText());
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		 System.out.println(nested_main_frame.getText());
		
		
	}
	

}
