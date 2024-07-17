package SeleniumRevision;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fileuploadpopup {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		/*
		driver.get("https://www.monsterindia.com/");

		driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[contains(text(),'Upload Resume')] ")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Users\\Shobha\\Desktop\\LocatorsStudentNotes.txt");
        */

		//Alert popup
		
		Alert alt=driver.switchTo().alert();
		alt.accept();
		
		alt.dismiss();
		
		
		//Athentication Popup
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
	}

}
