package SeleniumRevision;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownHandling_SelectClass {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[.='Create new account']")).click();
		Thread.sleep(2000);
		
	/*	WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Thread.sleep(2000);
		day.click();
		
		//dropdown using robot class
		Robot bot=new Robot();
		bot.keyPress(KeyEvent.VK_UP);
		bot.keyRelease(KeyEvent.VK_UP);
		Thread.sleep(2000);
		bot.keyPress(KeyEvent.VK_UP);
		bot.keyRelease(KeyEvent.VK_UP);
		Thread.sleep(2000);
		bot.keyPress(KeyEvent.VK_UP);
		bot.keyRelease(KeyEvent.VK_UP);
		Thread.sleep(2000);
		
		bot.keyPress(KeyEvent.VK_DOWN);
		bot.keyRelease(KeyEvent.VK_DOWN);
//		bot.keyPress(KeyEvent.VK_ENTER);
//		bot.keyRelease(KeyEvent.VK_ENTER);
		*/
		
		// dropdown using select class
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select sel =new Select(month);
		//sel.selectByIndex(0); // selects item at that index
		//sel.selectByValue("5"); // selects item with value as given
		//sel.selectByVisibleText("Jun"); //selects value by the visible text
		
		
		//selecting dropdown by xpath
		driver.findElement(By.xpath("//option[text()='12']")).click();
		driver.findElement(By.xpath("//option[.='Dec']")).click();
		driver.findElement(By.xpath("//option[.='2006']")).click();
		
		
		
		
		
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		
		
		
		

	}

}
