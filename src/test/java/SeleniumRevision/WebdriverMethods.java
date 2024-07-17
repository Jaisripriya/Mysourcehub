package SeleniumRevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class WebdriverMethods {

	public static void main(String[] args) throws Throwable {
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		// method1: get()
		//driver.get("https://www.facebook.com");
		
		
		//method2:navigate()
//		driver.navigate().to("https://www.amazon.in");
////    Thread.sleep(1000);
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("nike shoe");
//		driver.findElement(By.id("nav-search-submit-button")).click();
////	driver.findElement(By.name("login")).click();
//		//driver.navigate().refresh();
		
		//method3: getTitle()
//		String title=driver.getTitle();
//		System.out.println(title);
		
		//Method4: getCurrentUrl
//		String url=driver.getCurrentUrl();
//		System.out.println(url);
		
		//Method5: getPageSource()
////		String pagesource=driver.getPageSource();
////		System.out.println(pagesource);
		
		//Method6: manage()
////		Options data= driver.manage();
////		Window win=data.window();
////		win.maximize();
//		Thread.sleep(3000);
//		//driver.manage().window().minimize();
		
		driver.navigate().to("https://www.facebook.com");
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		
		//Method7:close()
		//driver.close();
		
		//Method8:quit()
		driver.quit();
		
		//Method9,10,11--> getwindowHandle(),getWindowHandles() and switchTo()
	}

}
