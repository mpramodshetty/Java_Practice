package practice;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintTheLinksPresentInWebPage {

	public static void main(String[] args) throws IOException 
	{
	WebDriver driver = new FirefoxDriver();

	driver.get("https://www.google.co.in/?gws_rd=ssl");
	
	//Take a Screen shot
	
	File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    // Code to copy the screenshot in the desired location
     FileUtils.copyFile(scrFile, new File("C:\\CaptureScreenshot\\google.jpg"));
     
	List<WebElement> AllLinks = driver.findElements(By.xpath("//a"));
	int Count = AllLinks.size();
	System.out.println(Count);
	for(int i=0;i<Count;i++)
	{
		String LinksName = AllLinks.get(i).getText();
		//System.out.println(LinksName);
		if(LinksName.length()>0)
		{
			System.out.println(LinksName);
		}
	}
driver.close();
	}

}
