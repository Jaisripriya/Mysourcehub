package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import static org.testng.AssertJUnit.assertTrue;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipKartScenarioTest {
	WebDriver driver;
	
	
	@BeforeClass
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
@Test(priority=1)
public void searchProdct()
{
	//launch URL
	driver.get("https://www.flipkart.com/");
	
	//Search a product
	WebElement search = driver.findElement(By.name("q"));
	search.sendKeys("redmi mobile");
	search.submit();
	
	//validate the result
	String pageTitle = driver.getTitle(); 
	org.testng.Assert.assertTrue(pageTitle.contains("Redmi Mobile"), "search result not displayed");
	 
	
}
@Test(priority=2)
public void addToCart() {
	WebElement prodct = driver.findElement(By.xpath("//div[@class='col col-7-12']/div[1]"));
  prodct.click();
  
  //click on add to cart button
  
  driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
}
}
