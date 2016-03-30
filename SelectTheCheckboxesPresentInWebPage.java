package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelectTheCheckboxesPresentInWebPage 
{

	
	public static void main(String[] args) 
	{
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.gsmarena.com/samsung-phones-9.php");
		
		List<WebElement> AllCheckBoxes = driver.findElements(By.xpath("//input[@type='Checkbox']"));
		
		int count = AllCheckBoxes.size();
		for(int i=0;i<count;i++)
		{
			//select all check boxes in forward direction
			AllCheckBoxes.get(i).click();
			
			/*//Select alternate check boxes
			AllCheckBoxes.get(i).click();
			i++;*/
				
		}
		//deselect all
		/*for(int i=0;i<count;i++)
		{
			//select all check boxes in forward direction
			AllCheckBoxes.get(i).click();
			
			//Select alternate check boxes
			AllCheckBoxes.get(i).click();
			i++;
				
		}*/
		
		/*//select 1st & last check boxes
		AllCheckBoxes.get(0).click();
		AllCheckBoxes.get(count-1).click();*/
	}

}
