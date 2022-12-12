package seleniumstudy;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot1
{
public static void takescreenshot(WebDriver driver,String filename)throws IOException{
 File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 System.out.println(src);
	
	String clip1 = RandomString.make(3);
	File dest=new File("D:\\varsha\\Selenium"+clip1+"png");
	FileHandler.copy(src, dest);
	}
}