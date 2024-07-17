package SeleniumRevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MethodsofActionClass {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
		
		//moveToElement
//		WebElement ele = driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
//		Actions act=new Actions(driver);
//		act.moveToElement(ele).perform();
//		
		//contextClick
		
//		WebElement element = driver.findElement(By.xpath("//a[.='Mobiles']"));
//Actions act1=new Actions(driver);
//		//act1.contextClick(element).perform();
//		act1.moveToElement(element).contextClick(element).perform();
		
		//sendKeys()
		Actions act=new Actions(driver);
		act=new Actions(driver);
//		act.sendKeys(uname, "priyac2891@gmail.com").perform();
//		act.sendKeys(pass, "manager").perform();
//		
//		//click()
//		act.click(login).perform();
		
		//OR
		
		//act.sendKeys(uname, "priyac2891@gmail.com").sendKeys(pass, "manager").click(login).perform();
		
		//right click and double click
		
		/*driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement btn = driver.findElement(By.xpath("//span[.='right click me']"));
		WebElement button = driver.findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));
		act.contextClick(btn).perform();
		Thread.sleep(1000);
		act.doubleClick(button).perform();
		
		driver.get("https://www.makemytrip.com/");
		Actions act1=new Actions(driver);
		act1.moveByOffset(10,10).build();*/
		
		//drag and drop
		
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		Actions act1=new Actions(driver);
		//act1.dragAndDrop(drag, drop).perform();
		
		//clickandhold and release methods
		
//		act.clickAndHold(drag).perform();
//		act.release(drop).perform();
		act.clickAndHold(drag).release(drop).perform();
		
		
		
		Thread.sleep(3000);
		driver.close();
		
		
		
		
		
		

	}

}
