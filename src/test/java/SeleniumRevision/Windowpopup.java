package SeleniumRevision;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowpopup {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[.='Services']")).click();
		String mainId=driver.getWindowHandle();// returns the currently focused winow id
		System.out.println(mainId);

		Set<String> allids = driver.getWindowHandles();// retrns all the browser session ids
		
		System.out.println(allids);
		for(String id:allids) 
		{
			if(!mainId.equals(id)) 
			{
				driver.switchTo().window(id);
				Thread.sleep(1000);
				driver.findElement(By.xpath("//span[.='FIND JOBS']")).click();
				
			}
			
		}
		driver.switchTo().window(mainId);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[.='Register']")).click();
	}

}
