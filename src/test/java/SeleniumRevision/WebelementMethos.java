package SeleniumRevision;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v112.dom.model.Rect;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebelementMethos {
@Test
public void webmeyhods() {
	//public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		WebDriver d=new EdgeDriver();
		//d.get("https://www.facebook.com/");
		/*WebElement logo = d.findElement(By.xpath("//img[contains(@class,'fb_logo ')]"));
		
		//getcssValue("font-size")
		String data=logo.getCssValue("font-size");
		System.out.println(data);
		
		//getcssValue("color")
		String color=logo.getCssValue("color");
		System.out.println(color);*/
		
		//getlocation()
		
		//WebElement lang = d.findElement(By.xpath("//a[.='മലയാളം']"));
	 /* Point val = lang.getLocation();
	  System.out.println(val.getX());
	  System.out.println(val.getY());
	  System.out.println(val);
	  
	  
	  //getsize()
	  Dimension dim=lang.getSize();
	  System.out.println(dim.getHeight());
	  System.out.println(dim.getWidth());
	  System.out.println(dim);
	  
	  //getrect-both dimension and location
	  Rectangle rect=lang.getRect();
	  System.out.println(rect.getX());
	  System.out.println(rect.getY());
	  System.out.println(rect.getHeight());
	  System.out.println(rect.getWidth());
	  System.out.println(rect);
		
		//sendkeys()
		WebElement mail = d.findElement(By.id("email"));
		mail.sendKeys("lmdklwe@gmail.com");
		
		//clear()
		Thread.sleep(1000);
		mail.clear();
		
		//isDisplayed
		WebElement logo1 = d.findElement(By.xpath("//img[@alt='Facebook']"));
		if(logo1.isDisplayed()) {
			System.out.println("displayed");
		}
		else {
			System.out.println("not displaye");
		}
		
		//isEnabled
	 WebElement acc = d.findElement(By.xpath("//a[.='Create new account']"));
	 if(acc.isEnabled()) {
			System.out.println("enabled");
		}
		else {
			System.out.println("not enabled");
		}
		*/
		
		//isSelected()
	 d.get("https://online.actitime.com/pc/login.do");
	 WebElement chkbox = d.findElement(By.name("remember"));
	 if(chkbox.isSelected()) {
		 System.out.println("selected");
	 }
	 else {
		 System.out.println("not selected");
	 }
	 
	 //getAttribte()
	 WebElement name = d.findElement(By.id("username"));
	 String value = name.getAttribute("class");
 System.out.println(value);
 
 //getting  null if there is no value ond
 WebElement log = d.findElement(By.id("loginButton"));
  String val = log.getAttribute("name");
  System.out.println(val);
		
	 //getTagname()
	 
	 WebElement logbtn = d.findElement(By.xpath("//div[.='Login ']"));
	// String value1 = logbtn.getTagName();
	 System.out.println("tagname="+logbtn.getTagName());
	 
	 //getArialRole()
	 WebElement name1 = d.findElement(By.id("username"));
	 System.out.println("arialrole="+name1.getAriaRole());
	 
	 //getDomattribte()
	 name1.sendKeys("admin");
	 String domvalue = name1.getDomAttribute("class");
	 System.out.println("domattribute:"+domvalue);
	 
	 //getAccessible name-> name visible in the text field
	 WebElement dat = d.findElement(By.id("username"));
	 System.out.println(dat.getAccessibleName());
	 
	 
		
		

	}

}

