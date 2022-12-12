package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class myntra {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "D:\\varsha\\Selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.myntra.com/?utm_source=perf_google_search_brand&utm_medium=perf_google_search_brand&utm_campaign=Search_Brand_Myntra_Brand_India_BM_TROAS_SOK&gclid=CjwKCAjwm8WZBhBUEiwA178UnDsGyDX4uIYSI7h");
	Thread.sleep(1000);
	WebElement men=driver.findElement(By.className("desktop-main"));
	men.click();
	System.out.println("men option is clicking"+men);
	Thread.sleep(1000);
	WebElement women=driver.findElement(By.xpath("(//a[text()='Women'])[1]"));
	women.click();
	Thread.sleep(1000);
	WebElement kids=driver.findElement(By.xpath("(//a[text()='Kids'])[1]"));
	kids.click();
	Thread.sleep(1000);
	WebElement home_living=driver.findElement(By.xpath("(//a[text()='Home & Living'])[1]"));
	home_living.click();
	Thread.sleep(1000);
	WebElement beauty=driver.findElement(By.xpath("(//a[@class='desktop-main'])[5]"));
	beauty.click();
	Thread.sleep(1000);
	WebElement search_bar=driver.findElement(By.className("desktop-searchBar"));
	search_bar.sendKeys("mens shoes");
    Thread.sleep(1000);
	WebElement search=driver.findElement(By.className(""));
	search.submit();
	
	
	
	
	
	}

}
