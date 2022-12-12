package pop_up;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class velocitypage_pop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\varsha\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]")).click();
		Set<String> allwindowsid = driver.getWindowHandles();
		for(String a:allwindowsid) {
			System.out.println(a);
		}
		Iterator<String>it=allwindowsid.iterator();
		String mainpage=it.next();//focus on main page
		String childpage=it.next();//focus on child frame
		driver.switchTo().window(childpage);//switch focus from main page to child page
		Thread.sleep(500);
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		Select s=new Select(dropdown);
		s.selectByVisibleText("Option2");
		driver.close();//close child page
		driver.switchTo().window(mainpage);//switch focus from child page to main page
		//driver.findElement(By.xpath("nav-link")).click();
		WebElement v_text = driver.findElement(By.xpath("//h3[contains(text(),'For Velocity class inquiry ')]"));
		
		System.out.println("v_text is : "+v_text.getText());
		
		
		

	}

}
