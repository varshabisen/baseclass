package selenium_practiceLink;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTable {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\varsha\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();;
		driver.get("https://demoqa.com/buttons");
		Thread.sleep(1000);
		WebElement Web_Tables = driver.findElement(By.xpath("//span[text()='Web Tables']"));
		 Web_Tables.click();
		  Thread.sleep(500);
		  //outer loop
		  for (int i=1;i<=3;i++) {
			  //System.out.println("I value: " +i);
			  
			  for(int j=1;j<=i;j++) {
				  
				  //System.out.println("J value: " +j);
				  if(i==1) {
					  String headings =driver.findElement(By.xpath("//div[@class='rt-th rt-resizable-header -cursor-pointer']["+i+"]")).getText();
					  System.out.print(headings+"||");
					 }
				  else {
					  String rows=driver.findElement(By.xpath("//div[@class='rt-tr-group']["+i+"]")).getText();
					 
					  System.out.print(rows+"||");
					  }
			  
			  }
			  System.out.println();
		  }
		  
}
}
