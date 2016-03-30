package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LogInWithoutPressEnterKey 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.get("http://demo.actitime.com/login.do");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		String value = driver.findElement(By.name("pwd")).getAttribute("placeholder");
		System.out.println(value);
		
		driver.findElement(By.name("pwd")).clear();
		
	Thread.sleep(1000);
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		//to press on login button we use RETURN key
		driver.findElement(By.id("loginButton")).sendKeys(Keys.RETURN);
		//driver.close();

	}

}
