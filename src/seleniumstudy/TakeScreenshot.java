package seleniumstudy;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class TakeScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\varsha\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/premium");
		Thread.sleep(1000);
		
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(source);
		//File desti=new File("D:\\varsha\\Selenium\\myclip.png");
		//FileHandler.copy(source, desti);
		String st=RandomString.make(3);
		File destination=new File("D:\\\\varsha\\\\Selenium\\\\myclip"+st+".jpg");
		FileHandler.copy(source, destination);
		
		File det=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(det);
		//File source=new File("C:\\new sc\\screenshot.png");
		//FileHandler.copy(det, source);
		String s=RandomString.make(2);
		File source1=new File("C:\\new sc\\screenshot"+s+".png");
		FileHandler.copy(det, source1);
	}

}
