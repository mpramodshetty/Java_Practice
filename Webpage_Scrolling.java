package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Webpage_Scrolling {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		driver.findElement(By.id("lst-ib")).sendKeys("java");
		driver.findElement(By.id("lst-ib")).sendKeys(Keys.RETURN);
		
		Thread.sleep(2000);//wait for 2 seconds
		//Actions actions = new Actions(driver);
		//actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		
		JavascriptExecutor je=(JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(2000);
		JavascriptExecutor je1=(JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(250,0)", "");
	}

}
