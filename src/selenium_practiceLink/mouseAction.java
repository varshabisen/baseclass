package selenium_practiceLink;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseAction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\varsha\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();;
		driver.get("https://demoqa.com/buttons");
		Thread.sleep(1000);
		Actions act=new Actions(driver);
		System.out.println("=====click action======");
		WebElement ClickMe = driver.findElement(By.xpath("//button[text()='Click Me']"));
	    act.moveToElement(ClickMe).click().perform();
	    Thread.sleep(500);
	    System.out.println("====right click action====");
	    WebElement rightclick = driver.findElement(By.id("rightClickBtn"));
	    act.contextClick(rightclick).click().perform();
	
	    Thread.sleep(500);
	    System.out.println("===double_click action====");
	    WebElement double_Click = driver.findElement(By.id("doubleClickBtn"));
	    act.doubleClick(double_Click).click().perform();
	    Thread.sleep(500);
	    System.out.println("====texbox fields====");
	    WebElement item = driver.findElement(By.className("text"));
	    act.moveToElement(item).click().perform();
	    Thread.sleep(500);
	   WebElement name = driver.findElement(By.id("userName"));
	   name.sendKeys("Varsha Rahangdale");
	   Thread.sleep(500);
	   WebElement email = driver.findElement(By.id("userEmail"));
	   email.sendKeys("vsrahangadle15@gmail.com");
	   Thread.sleep(500);
	   WebElement c_address = driver.findElement(By.id("currentAddress"));
	   c_address.sendKeys("Bhusari Colony,Kothrud,Pune");
	   Thread.sleep(500);
	  WebElement P_Address = driver.findElement(By.id("permanentAddress"));
	  P_Address.sendKeys("Shastri Ward,Gondia");
	  Thread.sleep(500);
	  WebElement Submit = driver.findElement(By.id("submit"));
	  //Submit.click();
	  Thread.sleep(500);
	  System.out.println("======checkbox====");
	  WebElement checkbox = driver.findElement(By.xpath("//span[text()='Check Box']"));
	  act.click(checkbox).click().perform();
	  Thread.sleep(500);
	  WebElement Home_Click = driver.findElement(By.className("rct-checkbox"));
	  Home_Click.click();
	  System.out.println("=====radio_button====");
	  WebElement radio_button = driver.findElement(By.xpath("//span[text()='Radio Button']"));
	  act.click(radio_button).click().perform();
	  Thread.sleep(500);
	  WebElement Yes_rb = driver.findElement(By.xpath("//label[text()='Yes']"));
	  Yes_rb.click();
	  Thread.sleep(500);
	  
	  System.out.println("=====Web Tables=====");
	  WebElement Web_Tables = driver.findElement(By.xpath("//span[text()='Web Tables']"));
	  act.click(Web_Tables).click().perform();
	  Thread.sleep(500);
	 System.out.println("===search any record from table====");
	  WebElement search = driver.findElement(By.id("searchBox"));
	  search.sendKeys("Gentry");
	  Thread.sleep(500);
	  System.out.println("====add new record in table");
	  WebElement Add_Button = driver.findElement(By.id("addNewRecordButton"));
	  Add_Button.click();
	  Thread.sleep(500);
	  System.out.println("====registration form for new user ");
	  driver.findElement(By.id("firstName")).sendKeys("john");
	  Thread.sleep(500);
	  
	  driver.findElement(By.id("lastName")).sendKeys("patel");
	  Thread.sleep(500);
	  
	  driver.findElement(By.id("userEmail")).sendKeys("john.b12@gmail.com");
	  Thread.sleep(500);
	  driver.findElement(By.id("age")).sendKeys("30");
	  Thread.sleep(500);
	  
	  driver.findElement(By.id("salary")).sendKeys("2200");
	  Thread.sleep(500);
	  driver.findElement(By.id("department")).sendKeys("IT-support");
	  Thread.sleep(500);
	  driver.findElement(By.id("submit")).click();
	 // System.out.println("===clear item in search box===");
	 // driver.findElement(By.id("searchBox")).clear();
	 // Thread.sleep(500);
	 // System.out.println("====search newly added record===");
	// driver.findElement(By.id("searchBox")).sendKeys("john");
	//  Thread.sleep(500);
	  
       // System.out.println("==edit existing record====");
	//driver.findElement(By.id("edit-record-1")).sendKeys("jenee");
	//  driver.findElement(By.xpath("//div[text()='Cierra']"));
	//  WebElement wt = driver.findElement(By.xpath("//div[@class='main-header']"));
	//  System.out.println(wt.getText());
	  WebElement FN = driver.findElement(By.xpath("(//div[@class='rt-th rt-resizable-header -cursor-pointer'])[1]"));
	  System.out.println(FN.getText());
	  
	  System.out.println("===get all headings of web table====");
	  
	  for(int i=1;i<=7;i++)
	  {
		 WebElement headings = driver.findElement(By.xpath("//div[@class='rt-th rt-resizable-header -cursor-pointer']["+i+"]"));
	 System.out.println(headings.getText());
	  
	  }
	  
	  System.out.println("===get web table rows");
	  for(int j=1;j<4;j++) {
		  WebElement Rows_data = driver.findElement(By.xpath("//div[@class='rt-tr-group']["+j+"]"));
		  System.out.println(Rows_data.getText());
	  }
	  
	  
	  
	  
	  
	  
	   
	  
	 
	}

}
