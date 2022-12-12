package seleniumstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FB_Drop_Down {

public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "D:\\varsha\\Selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			Thread.sleep(1000);
			
			WebElement create_new_ac=driver.findElement(By.xpath("//a[text()='Create New Account']"));
			create_new_ac.click();
			Thread.sleep(1000)
			
;			WebElement FN=driver.findElement(By.name("firstname"));
			FN.sendKeys("Bhuvarsh");
			Thread.sleep(1000);
			
			WebElement SN=driver.findElement(By.name("lastname"));
			SN.sendKeys("Bisen");
			Thread.sleep(1000);
			
			WebElement MobNo=driver.findElement(By.name("reg_email__"));
			MobNo.sendKeys("6789012356");
			Thread.sleep(1000);
			
			WebElement new_pwd=driver.findElement(By.name("reg_passwd__"));
			new_pwd.sendKeys("bhuvarsh@123");
			Thread.sleep(1000);
			
			WebElement day_drop_down=driver.findElement(By.id("day"));
			Select s = new Select(day_drop_down);
			s.selectByVisibleText("1");
			Thread.sleep(1000);
			
			WebElement month_drop_down=driver.findElement(By.name("birthday_month"));
			Select s1 = new Select(month_drop_down);
			s1.selectByValue("5");
			Thread.sleep(1000);
			
			WebElement year_drop_down=driver.findElement(By.id("year"));
			Select s2 = new Select(year_drop_down);
			s2.selectByVisibleText("1996");
			Thread.sleep(1000);
			
			WebElement radio_button=driver.findElement(By.xpath("//label[text()='Female']"));
			boolean result= radio_button.isSelected();
			System.out.println("radio button status is : "+result);
			radio_button.click();
			
			boolean result1= radio_button.isSelected();
			System.out.println("radio button status is : "+result1);
			
			//WebElement sign_up_button=driver.findElement(By.name("websubmit"));
			//sign_up_button.click();
			
			
			
			
			
			
			
			

			
			

	}

}
