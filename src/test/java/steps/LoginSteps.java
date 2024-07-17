package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.asserts.Assertion;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.WebDriverManagerException;

public class LoginSteps {
	WebDriver driver;

	
	  @Given("User should navigate to the application login") // ctrl+shift+o --> to import something //select +ctrl+/ -> to comment a block 
	  public void usernavigate()
	   {
	  driver=new EdgeDriver();
	  driver.get("https://bookcart.azurewebsites.net/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  }
	 
	@Given("User should click the login link")
	public void userShouldClickTheLoginLink() {
		driver.findElement(By.xpath("//span[text()=' Login ']")).click();
	    
	}

	/*
	 * @Given("User enter the username as ortoni") public void
	 * userEnterTheUsernameAsOrtoni() {
	 * driver.findElement(By.xpath("//input[@formcontrolname='username']")).sendKeys
	 * ("ortoni"); }
	 * 
	 * @Given("User enter the password as pass1234") public void
	 * userEnterThePasswordAspass1234() {
	 * driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys
	 * ("pass1234");
	 * 
	 * }
	 */
	@When("User click the login button")
	public void userClickTheLoginButton() {
		driver.findElement(By.xpath("//span[.='Login']")).click();
		
	    
	}
	@Given("User enter the username as {string}")
	public void userEnterTheUsernameAs(String username) {
		driver.findElement(By.xpath("//input[@formcontrolname='username']")).sendKeys(username);
	   
	}
	@Given("User enter the password as {string}")
	public void userEnterThePasswordAs(String password) {
		driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys(password);
	    
	}

	@Then("Login shold be sccessfull")
	public void loginSholdBeSccessfull() {
		String text = driver.findElement(By.xpath("//a//span[1]")).getText();
		System.out.println(text);
//	    if(text.equals("ortoni")) {
//	    	System.out.println("Login Success");
//	    }
//	    else {
//	    	System.out.println("Login Failre");
//	    }
		driver.close();
	}
	/*
	 * @Given("User enter the username as abc") public void
	 * userEnterTheUsernameAsAbc() {
	 * driver.findElement(By.xpath("//input[@formcontrolname='username']")).sendKeys
	 * ("abc"); }
	 * 
	 * @Given("User enter the password as Pass") public void
	 * userEnterThePasswordAsPass() {
	 * driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys
	 * ("pass");
	 * 
	 * }
	 */
	    
	@Then("Login should be fail")
	public void loginShouldBeFail() {
		String loginfail=driver.findElement(By.id("mat-mdc-error-0")).getText();
		System.out.println(loginfail);
		org.testng.Assert.assertEquals(loginfail,"Username or Password is incorrect.");
		driver.quit(); 
	}
	

}
