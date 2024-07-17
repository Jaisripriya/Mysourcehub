package SeleniumRevision;

import java.awt.Robot;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdvScenarios_multipleelement {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
	/*	driver.get("https://www.flipkart.com/");
		
		//1) to capture all the links in the webpage
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		int count=0;
		for(WebElement links:allLinks) {
			System.out.println(links.getText());
			count++;
			
		}
		System.out.println("total links:"+count);
		driver.close();
		
		*/
		//2) handling SVG elements
		
		/*
		 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[name()='svg' and @class='gb_h']")).click();
		*/
		
		//3) handling keyboarstrokes
		/*driver.get("https://online.actitime.com/pc");
		driver.findElement(By.id("username")).sendKeys("priyac2891@gmail.com",Keys.TAB,"manager",Keys.TAB,Keys.SPACE,Keys.TAB,Keys.ENTER);
		*/
		//driver.get("https://www.flipkart.com/");
		//driver.findElement(By.name("q")).sendKeys("kurti",Keys.ENTER);
		
		
		
		//using robot class--> 
		//copy value from one field and paste it in another field using robot class
		driver.get("https://online.actitime.com/pc");
		//driver.findElement(By.id("username")).sendKeys("priyac2891@gmail.com");
		
		/*
		Robot bot=new Robot();
		bot.keyPress(KeyEvent.VK_CONTROL);
		bot.keyPress(KeyEvent.VK_A);
		bot.keyRelease(KeyEvent.VK_CONTROL);
		bot.keyRelease(KeyEvent.VK_A);
		
		bot.keyPress(KeyEvent.VK_CONTROL);
		bot.keyPress(KeyEvent.VK_C);
		bot.keyRelease(KeyEvent.VK_CONTROL);
		bot.keyRelease(KeyEvent.VK_C);
		
		bot.keyPress(KeyEvent.VK_TAB);
		bot.keyRelease(KeyEvent.VK_TAB);
		
		bot.keyPress(KeyEvent.VK_CONTROL);
		bot.keyPress(KeyEvent.VK_V);
		bot.keyRelease(KeyEvent.VK_CONTROL);
		bot.keyRelease(KeyEvent.VK_V);
		
		bot.keyPress(KeyEvent.VK_TAB);
		bot.keyRelease(KeyEvent.VK_TAB);
		bot.keyPress(KeyEvent.VK_TAB);
		bot.keyRelease(KeyEvent.VK_TAB);
		bot.keyPress(KeyEvent.VK_ENTER);
		bot.keyRelease(KeyEvent.VK_ENTER);
		*/
		
	    WebElement element = driver.findElement(By.id("username"));
	    element.sendKeys("priyac2891@gmail.com");
	    element.sendKeys(Keys.CONTROL,"a");
	    element.sendKeys(Keys.CONTROL,"c");
	    WebElement element1 = driver.findElement(By.name("pwd"));
	    element1.sendKeys(Keys.CONTROL,"v", Keys.TAB,Keys.TAB,Keys.ENTER);
	    
		
	
		
		
		
		
		
	}

}
