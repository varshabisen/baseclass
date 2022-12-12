package DynamicWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\varsha\\selenium jar\\chromedriver_win32 (1)\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://urbanplatter.in/");
		Thread.sleep(2000);
		
		//System.out.println(driver.findElement(By.xpath("//article[starts-with(@id,'post')])")).getText());
		driver.findElement(By.xpath("(//*[@id='woocommerce-product-search-field-0']//following::input)[2]")).sendKeys("jam");
          //driver.findElement(By.xpath(""))
	}

}
