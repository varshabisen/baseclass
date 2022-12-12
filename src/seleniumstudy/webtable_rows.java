package seleniumstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable_rows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\varsha\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
	     WebElement table = driver.findElement(By.xpath("//table[@id='product']//tr[1]/th[1]"));
	     System.out.println(table.getText());
	     //outer loop for all rows 1-11
	     for(int i=1;i<=11;i++) {
	    	 //nested or inner for loop for columns/heading 1-3
	    	 for(int j=1;j<=3;j++) {
	    		 if(i==1)
	    		 {
	    			 String headings = driver.findElement(By.xpath("//table[@id='product']//tr["+i+"]/th["+j+"]")).getText();
	    			 System.out.print(headings+"||");
	    		 }
	    		 else {
	    		 String total_rows = driver.findElement(By.xpath(("//table[@id='product']//tr["+i+"]/td["+j+"]"))).getText();
	    		 System.out.print(total_rows+"||");
	    		 }
	    		 }
	    	 System.out.println();
	    	 }
	     
	    	 
	     

	}

}
