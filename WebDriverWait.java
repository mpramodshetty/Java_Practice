package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverWait 
{

	static WebDriver driver;
	public static void main(String[] args) 
	{
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.get("https://mail.google.com/");
		driver.findElement(By.id("Email")).sendKeys("mpramodshetty.86");
		driver.findElement(By.id("Passwd")).sendKeys("quickjob");
		driver.findElement(By.id("signIn")).click();
		String title=driver.getTitle();
		
		System.out.println(title);
		
		//logout
		driver.findElement(By.xpath("//span[@Class='gb_da gbii']")).click();
		driver.findElement(By.xpath("//a[text()='Sign out']")).click();
		driver.close();
		
	}

}
