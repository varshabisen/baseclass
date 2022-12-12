package pop_up;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_browser_popup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\varsha\\Selenium\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();

		driver.get("https://skpatro.github.io/demo/links/");
          Thread.sleep(1000);
          // driver.findElement(By.name("NewTab")).click();
           Thread.sleep(500);
           //String allpages = driver.getWindowHandle();
          // System.out.println(allpages);
         // driver.switchTo().window("childframe");
         // Thread.sleep(500);
          driver.findElement(By.name("NewWindow")).click();
          Set<String>allwindows = driver.getWindowHandles();
          System.out.println(allwindows);
          Thread.sleep(500);
          Iterator<String>it=allwindows.iterator();
         String main_page=it.next();
         String child_page=it.next();
         Thread.sleep(500);
         driver.switchTo().window(child_page);
         Thread.sleep(1000);
 		driver.manage().window().maximize();
 		Thread.sleep(500);
 	    driver.findElement(By.xpath("//input[@id='the7-search']")).sendKeys("hello_madam");
 	    
 	    driver.close();

         
  		

	}

}
