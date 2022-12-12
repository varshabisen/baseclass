package seleniumstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox_ByClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\varsha\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		WebElement checkbox1=driver.findElement(By.id("checkBoxOption1"));
		checkbox1.click();
		
		WebElement checkbox2=driver.findElement(By.id("checkBoxOption2"));
		checkbox2.click();
		
		WebElement checkbox3=driver.findElement(By.id("checkBoxOption3"));
		checkbox3.click();
		
		//for radio buttons
		WebElement radio_button1=driver.findElement(By.name("radio"));
		radio_button1.click();
		
		WebElement radio_button2=driver.findElement(By.xpath("//input[@name='radio'][2]"));
		radio_button2.click();
		
		
	}

}
