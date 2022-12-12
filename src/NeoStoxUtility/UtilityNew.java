package NeoStoxUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

import net.bytebuddy.utility.RandomString;

public class UtilityNew {

public static  String readDataFromPropertyFile(String key) throws IOException {
	//create object of properties class
	
	Properties pro=new Properties();
	
	//create object of fileInputStream
	
	FileInputStream file=new FileInputStream("C:\\Users\\bhbis\\eclipse-workspace\\SeleniumProjerct\\MyFile.properties");
	pro.load(file);
	System.out.println(file);
	String value = pro.getProperty(key);
	Reporter.log("reading value of "+key+" from property file",true);
	return value;
}
public static void takeScreenshot(WebDriver driver,String filename) throws IOException {
	try {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String st=RandomString.make(3);
		
		File dest=new File("D:\\varsha\\Selenium\\"+st+".png");
		FileHandler.copy(src, dest);
		Reporter.log("taking screenshot",true);
	} catch (Exception e) {
		System.out.println(e);
	}
	
			
}
public static void ScrollIntoView(WebDriver driver,WebElement element) {
	JavascriptExecutor js=((JavascriptExecutor)driver);
	js.executeScript("arguments[0].scrollIntoView(true)",element);
	Reporter.log("scrolling into view "+element.getText(),true);

	}
public static void wait(WebDriver driver,int waittime) {
	
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waittime));
	Reporter.log("waiting for "+waittime+"milis",true);

	
}



	}



