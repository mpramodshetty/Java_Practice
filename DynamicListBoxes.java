package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicListBoxes 
{

	
	public static void main(String[] args) throws InterruptedException 
	{
		//to remove log4j warning
		System.setProperty("org.apache.commons.logging.Log", "org.apache.commons.logging.impl.Jdk14Logger");
		WebDriver driver = new FirefoxDriver();
		
		   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		   driver.get("http://www.plus2net.com/php_tutorial/ajax-dd3.php");
		   
		   WebElement Country = driver.findElement(By.name("country"));		   
		   Select SelectCountry = new Select(Country);
		   SelectCountry.selectByValue("IND");
		 //print the selected option
		  WebElement FirstSelecteOpt = SelectCountry.getFirstSelectedOption();
		  String FirstSelecteOptText = FirstSelecteOpt.getText();
		  System.out.println(FirstSelecteOptText);
		  
		  //WebDriverWait wait = new WebDriverWait(driver, 20);
		  //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("xpathExpression")));
		 
		   WebElement State = driver.findElement(By.name("state"));
		   Select SelectState = new Select(State);
		   SelectState.selectByValue("Rajasthan");
		   //print the selected option
		   WebElement FirstSelecteOpt1 = SelectState.getFirstSelectedOption();
			  String FirstSelecteOptText1 = FirstSelecteOpt1.getText();
			  System.out.println(FirstSelecteOptText1);
		
		

	}

}
