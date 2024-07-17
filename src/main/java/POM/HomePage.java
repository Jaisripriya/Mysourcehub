package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//div[.='Tasks']")
	private WebElement task;

	//getter method
	public WebElement getTask() {
		return task;
	}

	
	//Business logic
	public void clickTasks() {
		task.click();
	}
	

	
}
