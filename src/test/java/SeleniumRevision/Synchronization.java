package SeleniumRevision;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Synchronization {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://online.actitime.com/pc/login.do");
		driver.manage().window().maximize();
		WebElement uname = driver.findElement(By.name("username"));
		uname.sendKeys("priyac2891@gmail.com",Keys.TAB,"manager");
		WebElement loginbtn = driver.findElement(By.xpath("//div[.='Login ']"));
		
		//Explicit wait
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.elementToBeClickable(loginbtn));
		
	FluentWait fluent=new FluentWait(driver);
	fluent.pollingEvery(Duration.ofSeconds(1));
	fluent.withTimeout(Duration.ofSeconds(10));
	fluent.until(ExpectedConditions.elementToBeClickable(loginbtn));
	loginbtn.click();
	fluent.until(ExpectedConditions.titleContains("Enter Time-Track"));
		
		
		driver.quit();

	}

}
