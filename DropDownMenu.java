package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDownMenu 
{

	public static void main(String[] args) 
	{
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.Jdk14Logger");
		WebDriver driver = new FirefoxDriver();
		
		   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		   driver.get("http://www.yatra.com/");
		   WebElement CustomSupportLink = driver.findElement(By.xpath("//a[text()='Customer Support']"));
		   Actions action = new Actions(driver);
		   action.moveToElement(CustomSupportLink).perform();
		   driver.findElement(By.linkText("Customer Forums")).click();
		  // action.doubleClick();
		   driver.close();

	}

}
