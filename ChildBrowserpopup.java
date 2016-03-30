package practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChildBrowserpopup {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.naukri.com/");
		Set<String> AllWH = driver.getWindowHandles();
		int BrowserCount = AllWH.size();
		System.out.println(BrowserCount);
		Iterator<String> AllWHindows = AllWH.iterator();
		while(AllWHindows.hasNext())
		{
			String parent = AllWHindows.next();
			String Child1 = AllWHindows.next();
			String Child2 = AllWHindows.next();
			driver.switchTo().window(Child2);
			driver.close();
			driver.switchTo().window(Child1);
			String str1 = driver.getTitle();
			System.out.println(str1);
			driver.close();
		}
	}

}
