package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.thoughtworks.selenium.Wait;
/*We can scroll the web page using javaScript Executor in the java code.We have taken the below example with three different scenarios of scrolling a webpage.

1. We may require to scroll to bottom of the page and then perform operations. For this scenario we have created a test 'scrollingToBottomofAPage'/

2. Some times, we may require to scroll to particular element and peform operations on that particular element. For this we need to pass the element on which we need to perform operation. For this scenario we have created a test 'scrollingToElementofAPage'/

3. We can also use the coordinates to scroll to particular position by passing the coordinates. For this scenario we have created a test 'scrollingByCoordinatesofAPage'/
*/
public class PageScroll {

	WebDriver driver;
	String URL = "https://www.linkedin.com/";

	@BeforeClass
	public void setUp() {
		driver = new FirefoxDriver();
		driver.get(URL);
		driver.manage().window().maximize();
	}

	@Test(priority=1)
	public void scrollingToBottomofAPage() {
		driver.navigate().to(URL);
		 ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
	@Test(priority=2)
	public void scrollingToElementofAPage() {
		driver.navigate().to(URL+"directory/companies?trk=hb_ft_companies_dir");
		WebElement element = driver.findElement(By.linkText("Import/Export"));
		((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", element);
	}
	
	@Test(priority=3)
	public void scrollingByCoordinatesofAPage() {
		driver.navigate().to(URL+"job/?trk=hb_ft_jobs");
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();

	}

}
