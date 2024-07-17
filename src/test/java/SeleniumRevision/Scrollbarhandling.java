package SeleniumRevision;

import java.awt.AWTException;
import org.openqa.selenium.Point;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.checkerframework.framework.qual.TargetLocations;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrollbarhandling {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://www.selenium.dev/downloads/");
		
		//scrollbar handling using robot class
		
		/*Robot bot=new Robot();
		bot.keyPress(KeyEvent.VK_PAGE_DOWN);
		bot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(1000);
		bot.keyPress(KeyEvent.VK_PAGE_DOWN);
		bot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(1000);
		bot.keyPress(KeyEvent.VK_PAGE_DOWN);
		bot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(1000);
		bot.keyPress(KeyEvent.VK_PAGE_DOWN);
		bot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		Thread.sleep(1000);
		bot.keyPress(KeyEvent.VK_PAGE_UP);
		bot.keyRelease(KeyEvent.VK_PAGE_UP);
		Thread.sleep(1000);
		bot.keyPress(KeyEvent.VK_PAGE_UP);
		bot.keyRelease(KeyEvent.VK_PAGE_UP);*/
		
		/*
		//scrollbar- using javascript executor
		JavascriptExecutor js=(JavascriptExecutor)driver;
		for(int i=0;i<5;i++)
		{
		js.executeScript("window.scrollBy(0,800)");
		Thread.sleep(1000);
		}
		
		for(int i=0;i<4;i++)
		{
			js.executeScript("window.scrollBy(0,-600)");
			Thread.sleep(1000);
		}
		
		*/
		
		//scroll to view the particular element by using location
		
		driver.get("https://www.facebook.com/");
		WebElement ele = driver.findElement(By.xpath("//a[.='Instagram']"));
		
		//get location using point class
		 Point loc = ele.getLocation();
		 System.out.println(loc.getX());
		 System.out.println(loc.getY());
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 //js.executeScript("window.scrollBy(40,806)");
		 js.executeScript("arguments[0].scrollIntoView()",ele);
		 Thread.sleep(3000);
		 ele.click();
		
		
	}

}
