package SeleniumRevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {
@Test
public void locators() {
	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		//driver.get("https://www.facebook.com/");
		
		//id()
		//driver.findElement(By.id("email")).sendKeys("priyakuttans28@gmail.com");
		
		//name()
		//driver.findElement(By.name("email")).sendKeys("jdsjkf");
		
		//classname()
		//driver.findElement(By.className("inputtext")).sendKeys("kfj");
		
		//linktext()
		//driver.findElement(By.linkText("Forgotten password?")).click();
		
		//partiallinktext()
		//driver.findElement(By.partialLinkText("Forgotten")).click();
		
		
		//CSSSelector
		//by id()->[attribtename='attributevalue']
		//driver.findElement(By.cssSelector("[id='email']")).sendKeys("kdje");
		
		//Shortcut for id--> #
		//driver.findElement(By.cssSelector("#email")).sendKeys("kdje");
		
		//htmltag[attribtename='attributevalue']
		//driver.findElement(By.cssSelector("input[id='email']")).sendKeys("kdje");
		
		//by name
		//driver.findElement(By.cssSelector("[name='email']")).sendKeys("kje");
		//driver.findElement(By.cssSelector("input[name='email']")).sendKeys("uname");
		
		//by classname
		//driver.findElement(By.cssSelector("[class='inputtext _55r1 _6luy']")).sendKeys("kdje");
		//.findElement(By.cssSelector("input[class='inputtext _55r1 _6luy']")).sendKeys("kdje");
		
		//shortcut --> .
		//driver.findElement(By.cssSelector(".inputtext")).sendKeys("kdje");
		
		
		
		//xpath
		
		//xpath by attribute
		//driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("user");
		
		//xpath by text
		//driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		//driver.findElement(By.xpath("//a[.='Create new account']")).click();
		
		//xpath by contains attribute
		//driver.findElement(By.xpath("//input[contains(@placeholder,'Ema')]")).sendKeys("fr");
		
		//xpath by contains visible text 
		//driver.findElement(By.xpath("//a[contains(.,'Create new')]")).click();
		
		//multiple xpath
		//AND and OR operator
//		
//		driver.findElement(By.xpath("//input[@type='text' and @class='inputtext _55r1 _6luy']")).sendKeys("uname");	
//		driver.findElement(By.xpath("//input[@type='password' or @name='pass']")).sendKeys("password");
//		driver.findElement(By.xpath("//button[@name='login' and @class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']")).click();
//		
		//xpath by text function with multiple attributes
		//driver.findElement(By.xpath("//a[text()='Create new account' and @role='button']")).click();
		
		//handling partially dynamic elements by contains
		//driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		//driver.findElement(By.xpath("//a[contains(.,'Create')]")).click();
		
		
		//handling completely dynamic elements using traversing-->/ and /..
		driver.get("https://www.flipkart.com/");
		//driver.findElement(By.xpath("//span[text()='✕']")).click();
		WebElement data = driver.findElement(By.name("q"));
		data.sendKeys("saree");
		data.submit();
//		WebElement price = driver.findElement(By.xpath("//div[.='SMARTLOOKS']/../a/following-sibling::a/div/div"));
//		String value = price.getText();
//		System.out.println(value);


		String data1 = driver.findElement(By.xpath("(//div[@class='_13oc-S'])[1]/div[1]//a[2]/div/div[1]")).getText();
		System.out.println(data1);
		
		
		
		
		
		

		
		
		
	}

}
