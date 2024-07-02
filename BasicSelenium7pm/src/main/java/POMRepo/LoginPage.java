package POMRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	//Declaration
	@FindBy(id="user-name")
	private WebElement UserTextfield;
	
	@FindBy(css="[name=\"password\"]")
	private WebElement PasswordTextfield;
	
	@FindBy(xpath ="//input[@type=\"submit\"]")
	private WebElement LoginButton;
	
	//getter methods
	public WebElement getUserTextField() {
		return UserTextfield;
	}
	public WebElement getPasswordTextField() {
		return PasswordTextfield;
	}
	public WebElement getLoginButton() {
		return LoginButton;
	}
	
	//BusinessLogics
	public void loginToApp(String Username,String Password) {
		UserTextfield.sendKeys(Username);
		PasswordTextfield.sendKeys(Password);
		LoginButton.click();
		
	}
	
	
	
}
