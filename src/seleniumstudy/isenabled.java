package seleniumstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isenabled {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\varsha\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://auth.discoveryplus.in/login?flow=OTPLogin");
		Thread.sleep(1000);
		
		WebElement otp_button=driver.findElement(By.xpath("//button[text()='Get OTP']"));
		
		boolean result1=otp_button.isEnabled();
		System.out.println("otp button is : "+result1);
		
		WebElement mobno=driver.findElement(By.id("mobileNumber"));
		mobno.sendKeys("8555768789");
		Thread.sleep(1000);
		
		boolean result2=otp_button.isEnabled();
		System.out.println("otp button is : "+result2);
			otp_button.click();	}

	

}
