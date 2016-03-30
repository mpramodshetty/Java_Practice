package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoSuggestionHandling 
{
	public static void main(String[] args) 
	{
		   WebDriver driver = new FirefoxDriver();
		   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		   
		   driver.get("https://www.google.co.in");
		   driver.findElement(By.xpath("//div/input[@id='lst-ib']")).sendKeys("Selenium");
		   List<WebElement> AutoSugg = driver.findElements(By.xpath("//div[text()='selenium']"));
		   for(int i=0;i<AutoSugg.size();i++)
		   {
			   String SuugestedText = AutoSugg.get(i).getText();
			   System.out.println(SuugestedText);
			   if(SuugestedText.contains("webdriver"))
			   {
				   AutoSugg.get(i).click();
				   break;//use break statement else staleElement exception error will occure
			   }
		   }

	}

}
