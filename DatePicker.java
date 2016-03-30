package practice;

import java.awt.Image;
import java.awt.image.RenderedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.asprise.util.ocr.OCR;

public class DatePicker {

	
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf#");
		
		//driver.findElement(By.xpath("//div/input[@id='hot-check-in']")).click();
		String imageUrl = driver.findElement(By.xpath("//img[@id='cimage']")).getAttribute("src");
		
		System.out.println(imageUrl);
		
		URL url = new URL(imageUrl);  
		 Image image = ImageIO.read(url);
		OCR nw = new OCR();
		 String s = new OCR().recognizeCharacters((RenderedImage) image);  
		 System.out.println("Text From Image : \n"+ s);  
		 System.out.println("Length of total text : \n"+ s.length());
		
		driver.close();
		
	}

}
