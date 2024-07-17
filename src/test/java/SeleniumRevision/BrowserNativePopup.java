package SeleniumRevision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserNativePopup {
	public static void main(String[] args) {
		//open incognito window in chrome browser
		/*
		 * ChromeOptions opt=new ChromeOptions(); 
		 * opt.addArguments("Incognito");
		 * WebDriverManager.chromedriver().setup();
		 * WebDriver driver=new ChromeDriver(opt);
		 */
    //driver.get("https://demo.automationtesting.in/Frames.html");
		
		EdgeOptions option=new EdgeOptions();
		option.addArguments("inprivate");
		EdgeDriver driver=new EdgeDriver(option);
		driver.get("https://www.google.com/");
}
}
