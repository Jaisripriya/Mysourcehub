package org.com;

import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://chitti2.konnectify.io/login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("test@gm.co");
		
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("test@123");
		
		driver.findElement(By.xpath("//p[text()='Log in']")).click();
		
		Thread.sleep(6000);
		    //   (//button[@type='button'])[1]
		driver.findElement(By.xpath("(//*[@width='24'])[3]")).click();
		
		driver.findElement(By.xpath("//span[text()='New Konnector']")).click();

		
		
		
		
	}

}
