package SeleniumRevision;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalenderPopup {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.goibibo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
//		driver.findElement(By.xpath("//span[.='Departure']")).click();
		
		//Dynamic xpath
		
//		String month="April 2024";
//		String date="25";
//		
//		driver.findElement(By.xpath("//div[.='"+month+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[.='"+date+"']")).click();
//		
		
		
		//proabbadi- for dynamic xpath
		
		driver.get("https://www.prokabaddi.com/standings");
		
		String teamName="Dabang Delhi K.C.";
		System.out.println("team:"+teamName);
		
		System.out.println("Played="+driver.findElement(By.xpath("//p[.='"+teamName+"']/ancestor::div[@class='table-data team']/following-sibling::div[@class='table-data matches-play']")).getText());
		System.out.println("won="+driver.findElement(By.xpath("//p[.='"+teamName+"']/ancestor::div[@class='table-data team']/following-sibling::div[@class='table-data matches-won']")).getText());
		System.out.println("lost="+driver.findElement(By.xpath("//p[.='"+teamName+"']/ancestor::div[@class='table-data team']/following-sibling::div[@class='table-data matches-lost']")).getText());
		System.out.println("draw="+driver.findElement(By.xpath("//p[.='"+teamName+"']/ancestor::div[@class='table-data team']/following-sibling::div[@class='table-data matches-draw']")).getText());
		System.out.println("Score Difference="+driver.findElement(By.xpath("//p[.='"+teamName+"']/ancestor::div[@class='table-data team']/following-sibling::div[@class='table-data score-diff']")).getText());
		System.out.println("poins="+driver.findElement(By.xpath("//p[.='"+teamName+"']/ancestor::div[@class='table-data team']/following-sibling::div[@class='table-data points']")).getText());
		
		System.out.println("form");
		
		List<WebElement> form = driver.findElements(By.xpath("//p[.='"+teamName+"']/ancestor::div[@class='table-data team']/following-sibling::div[@class='table-data form']//li"));
		for(int i=0;i<form.size();i++) {
			System.out.println(form.get(i).getText());
		}
		
		driver.close();

	}

}
