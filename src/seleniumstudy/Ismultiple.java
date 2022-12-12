package seleniumstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ismultiple {

	public static void main(String[] args) throws InterruptedException   {
		System.setProperty("webdriver.chrome.driver", "D:\\varsha\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(2000);
		WebElement cars = driver.findElement(By.id("cars"));
		Select s=new Select(cars);
		System.out.println(s.isMultiple());
		Thread.sleep(1000);
		s.selectByVisibleText("Volvo");
		Thread.sleep(1000);
		s.selectByValue("opel");
		Thread.sleep(1000);
		s.selectByIndex(1);
		Thread.sleep(1000);
		s.selectByValue("audi");
		System.out.println("first selection is"+s.getFirstSelectedOption());

	}

}
