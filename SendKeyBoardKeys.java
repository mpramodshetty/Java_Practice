package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SendKeyBoardKeys {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		System.setProperty("webdriver.ie.driver", "C://IEDriverServer.exe");
		WebDriver myTestDriver = new InternetExplorerDriver(capabilities);
		 myTestDriver.get("https://www.google.com/");
		 myTestDriver.manage().window().maximize();
		 myTestDriver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 
		 myTestDriver.findElement(By.xpath("//input[@id='gbqfq']")).sendKeys(Keys.NUMPAD1, Keys.ADD, Keys.NUMPAD9, Keys.EQUALS,Keys.ENTER);
		 Thread.sleep(10000L);
		 myTestDriver.quit();
	}

}
