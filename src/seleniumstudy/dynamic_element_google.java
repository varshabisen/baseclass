package seleniumstudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.EqualsMethod;

public class dynamic_element_google {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\varsha\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();;
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("honda");
		Thread.sleep(500);
	    List<WebElement> element_list = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
         //how many result got?
	    System.out.println("result is : "+element_list.size());
	    //what are th results?
	    for(WebElement r:element_list) {
	    	System.out.println(r.getText());
	    	String expected_result="honda amaze";
	    	String actual_result=r.getText();
	    	
	    	if(expected_result.equals(actual_result))
	    	
	    	{r.click();
	    	break;
	    		
	    	}
	    	

	    }
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("Images")).click();
	}

}
