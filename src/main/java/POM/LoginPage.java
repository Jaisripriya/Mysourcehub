package POM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//initialization
	public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
	//declaration
	@FindBy(name="username")
	private WebElement userTextfield;
	
	@FindBy(name="pwd")
	private WebElement passwordTextfield;
	
	@FindBy(id="loginButton")
	private WebElement login;

	//getter methods
	
	public WebElement getUserTextfield() {
		return userTextfield;
	}

	public WebElement getPasswordTextfield() {
		return passwordTextfield;
	}

	public WebElement getLogin() {
		return login;
	}

	//Business Logic --> alternate for getter mehods
	
	public void logintoApp(String sername, String password) {
		userTextfield.sendKeys(sername);
		passwordTextfield.sendKeys(password);
		login.click();
		
	}
		
}
