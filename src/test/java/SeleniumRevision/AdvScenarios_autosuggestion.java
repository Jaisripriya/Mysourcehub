package SeleniumRevision;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdvScenarios_autosuggestion {
@Test
public void atoSggestion() throws Throwable {
	//public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.className("Pke_EE")).sendKeys("puma");
		List<WebElement> AllList = driver.findElements(By.className("_3D0G9a"));
		Thread.sleep(1000);
		for(WebElement list:AllList) 
		{
			Thread.sleep(1000);
			System.out.println(list.getText());
			String lists = list.getText();
			if(lists.equalsIgnoreCase("puma slippers men"))
		{
				list.click();
				break;
			}
			
		}
		
	}

}
