package pop_up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_pop_up {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\varsha\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://demoqa.com/alerts");
          Thread.sleep(1000);
          WebElement click_me = driver.findElement(By.id("alertButton"));
        click_me.click();
       
        Alert alt=driver.switchTo().alert();
        alt.accept();
        Thread.sleep(1000);
        WebElement text = driver.findElement(By.xpath("//div[text()='Alerts']"));
  		System.out.println(text.getText());


	}

}
