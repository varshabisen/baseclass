package seleniumstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextAndMethods {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "D:\\varsha\\Selenium\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://vctcpune.com/selenium/practice.html");

/*System.out.println(driver.findElement(By.xpath("//a[contains(text(),'Velocity Corporate')]")).getText());
String text=driver.findElement(By.xpath("//a[contains(text(),'Velocity Corporate')]")).getText();
System.out.println("text is:" +text);
Thread.sleep(2000);
System.out.println(driver.findElement(By.xpath("//h1[contains(text(),'Welcome ')]")).getText());*/

WebElement text1 =driver.findElement(By.xpath("//a[contains(text(),'Velocity Corporate')]"));
	String actual_result=text1.getText();
	System.out.println("actual result is : "+actual_result);
	String expected_result="VELOCITY CORPORATE TRAINING CENTER";
	
	if(actual_result.equals(expected_result))
	{
		System.out.println("result is matching,TC is passed");
	}
	else {
		System.out.println("result is not matching,TC is Failed");
	}



	}

}
