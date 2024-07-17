package SeleniumRevision;

import POM.LoginPage;
import POM.HomePage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PomImplementation {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		FileInputStream fis=new FileInputStream("./myprop.txt");
		Properties pro=new Properties();
		pro.load(fis);
		
		String URL=pro.getProperty("url");
		String NAME=pro.getProperty("username");
		String PASS = pro.getProperty("password");
		
		driver.get(URL);
		
		LoginPage login=new LoginPage(driver);
		//using getters
		/*login.getUserTextfield().sendKeys(NAME);
		login.getPasswordTextfield().sendKeys(PASS);
		login.getLogin().click();*/
		
		//using Business Logics
		login.logintoApp(NAME, PASS);
		Thread.sleep(1000);
//driver.findElement(By.xpath("//div[.='Tasks']")).click();
		
		//homepage implementation
		
	HomePage home=new HomePage(driver);
	home.getTask().click();
	//home.clickTasks()

		
	}

}
