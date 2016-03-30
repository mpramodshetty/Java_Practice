package practice;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TakeScreenshot 
{

   public static void main(String[] args) throws IOException, InterruptedException 
   {
	
	   WebDriver driver = new FirefoxDriver();
	   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	   //open a google
	   driver.get("https://www.google.co.in/");
	   //find +You element on web page
	   WebElement element1 = driver.findElement(By.linkText("+You"));
	   //context click on above element
	   Actions action = new Actions(driver);
	   action.contextClick(element1).sendKeys("W").perform();
	   
	   //control transfered to child browser
	   Iterator<String> allwindows = driver.getWindowHandles().iterator();
	  String win_1 = allwindows.next();
	  String win_2 = allwindows.next();
	  driver.switchTo().window(win_2);
	  
	   
	   //take screenshot
	   File src1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	   FileUtils.copyFile(src1, new File("C:\\CaptureScreenshot\\You.jpg"));
	   
	     driver.close();
	     //control transfered back to main browser	 
	    driver.switchTo().window(win_1);
	   
	   driver.findElement(By.xpath("//div/input[@id='lst-ib']")).sendKeys("Selenium");
	   driver.findElement(By.xpath("//button[@name='btnG']")).sendKeys(Keys.RETURN);
	   Thread.sleep(1000);
	   
	   //take screenshot
	   File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	   FileUtils.copyFile(src, new File("C:\\CaptureScreenshot\\google.jpg"));
	   
	   
	   driver.close();
	   

   }

}
