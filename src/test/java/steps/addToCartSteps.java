package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class addToCartSteps {
	WebDriver driver;
	@Given("User should navigate to the application")  // ctrl+shift+o --> to import something
	//select +ctrl+/ -> to comment a block
public void sernavigate()
{
driver=new EdgeDriver();
driver.get("https://bookcart.azurewebsites.net/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

}
	@Given("user should login as {string} and {string}")
	public void userShouldLoginAsAnd(String username, String password) {
		driver.findElement(By.xpath("//span[text()=' Login ']")).click();
		driver.findElement(By.xpath("//input[@formcontrolname='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys(password);
		driver.findElement(By.xpath("//span[text()=' Login ']")).click();
	   
	}
	@Given("user search a {string}")
	public void userSearchA(String book) {
		driver.findElement(By.xpath("//input[@aria-label='search']")).sendKeys(book);
		driver.findElement(By.cssSelector("div#mat-autocomplete-0>mat-option>span")).click();
	   
	}
	@When("user add a book to the cart")
	public void userAddABookToTheCart() {
		driver.findElement(By.xpath("//span[text()[normalize-space()='Add to Cart']]")).click();
	   try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
	}
	
	@Then("the cart badge should be updated")
	public void theCartBadgeShouldBeUpdated() {
		String text = driver.findElement(By.id("mat-badge-content-0")).getText();
	   Assert.assertEquals(Integer.parseInt(text)>0, true);
	   driver.quit();
	   
	}

}
