package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChildBrowser {

	/**
	 *
	 */
	public static void main(String[] args)
	{
		
		//System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	//WebDriver driver=new ChromeDriver();
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");

	}

}
