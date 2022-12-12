package seleniumstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamic_element_flipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\varsha\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();;
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(5000);
        driver.findElement(By.name("q")).sendKeys("iphone 14 pro max");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(5000);
        String review = driver.findElement(By.xpath("((//div[@class='col col-7-12'])[1]//span)[6]")).getText();
        System.out.println("review are : "+review);
      
       
	}

}
