package seleniumstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_table {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\varsha\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
	     WebElement table = driver.findElement(By.xpath("//table[@id='product']//tr[1]/th[1]"));
	     System.out.println(table.getText());
	     for(int i=1;i<=3;i++) {
	    	 WebElement heading= driver.findElement(By.xpath("//table[@id='product']//tr[1]/th["+i+"]"));
	        System.out.print(heading.getText());
	     
	     }
	     System.out.println();
	     for(int j=1;j<=3;j++) {
	    System.out.print(driver.findElement(By.xpath("//table[@id='product']//tr[4]/td["+j+"]")).getText()+" " );
	    
	     }
	     System.out.println("=======================");
	     
	     
	}

}
