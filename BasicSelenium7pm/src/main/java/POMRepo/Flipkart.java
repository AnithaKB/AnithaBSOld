package POMRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Flipkart {

	public Flipkart(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBys({@FindBy(xpath ="//input[@name=\"q\"]"),@FindBy(xpath = "//input[@class=\"Pke_EE\"]")})
	private WebElement searchTextfield;
	
	@FindAll({@FindBy(css = "[class=\"_2iLD__\"]"),@FindBy(css = "[type=\"submit\"]")})
	private WebElement searchIcon;
	
	public WebElement getSearchTextfield() {
		return searchTextfield;
	}
	
	public WebElement getSearchIcon() {
		return searchIcon;
	}

	public void methodText(String name) {
		searchTextfield.sendKeys(name);
	}
	
	public void icon() {
		searchIcon.click();
	}
	
	
}
