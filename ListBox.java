package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox {

	
	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		   driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		   driver.get("File:C:///Users/Pramod/Desktop/ListBox.html");
		   WebElement listbox = driver.findElement(By.id("CountrySelect"));
		   Select Select = new Select(listbox);
		   
		   //to select specific option in the list box
		   Select.selectByIndex(2);
		   Select.selectByIndex(0);
		  
		   
		   /*//print the Selected options
		   List<WebElement> SelectedOpt = Select.getAllSelectedOptions();
		   for(int i=0;i<SelectedOpt.size();i++)
		   {
			   String Opt = SelectedOpt.get(i).getText();
			   System.out.println(Opt);
		   }*/
		   
		   /*//to get the all option in the list box
		  List<WebElement> allOption = Select.getOptions();
		  for(int i=0;i<allOption.size();i++)
		  {
			  Select.selectByIndex(i);
			  
		  }
		  Select.deselectAll();*/

	}

}
