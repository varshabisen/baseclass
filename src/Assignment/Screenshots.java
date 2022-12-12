package Assignment;

import java.io.File;
import java.io.IOException;
import java.util.*;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.setProperty("webdriver.chrome.driver","D:\\varsha\\selenium jar\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
	        driver.manage().window().maximize();
			driver.get("https://login-v2.upstox.com/");
		    File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    System.out.println(src);
		    String file="test";
		    String path="D:\\varsha";
			File desti=new File(path+file+".png");
		    FileHandler.copy(src, desti);
		  
		} catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
		
		
	    
	}

}
