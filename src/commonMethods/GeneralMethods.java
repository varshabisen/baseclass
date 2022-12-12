package commonMethods;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class GeneralMethods {

	public static void scrollIntoView(WebDriver driver, WebElement 
			element)
			{
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true)",element);
			}
			public static void takeScreenshot(WebDriver driver,String fileName) 
			throws IOException, InterruptedException
			{
			Thread.sleep(1000);
			File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			String clip1 = RandomString.make(3);
			File dest= new File("D:\\varsha\\Selenium"+clip1+".png");
			
			FileHandler.copy(src, dest);
			}
			public static void waitTest(WebDriver driver, int waitTime)
			{
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waitTime));
			}
			}
