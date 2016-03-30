package practice;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserCompatiblityTest {

	
	public static void main(String[] args) throws IOException{
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.naukri.com/");
		driver.quit();
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driverch=new ChromeDriver();
		driverch.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driverch.get("http://www.naukri.com/");
		driverch.quit();
		
		System.setProperty("webdriver.ie.driver", "D:\\IEDriverServer.exe");
		WebDriver driverff=new InternetExplorerDriver();
		driverff.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driverff.get("http://www.naukri.com/");
		driverff.quit();
	}

}
