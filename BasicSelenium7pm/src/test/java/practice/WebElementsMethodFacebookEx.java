package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsMethodFacebookEx {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		WebElement fblogo = driver.findElement(By.xpath("//img[contains(@class,'f')]"));
		if(fblogo.isDisplayed()) {
			System.out.println("Logo is Displayed");
		}
		else {
			System.out.println("Logo is not Displayed");
		}
		
		WebElement link = driver.findElement(By.xpath("//a[text()=\"Create new account\"]"));
		if(link.isEnabled()) {
			link.click();
		}
		else {
			System.out.println("Element is not enabled");
		}
		Thread.sleep(3000);	
		WebElement radio = driver.findElement(By.xpath("//input[@value=\"1\"]"));
		radio.click();
		if(radio.isSelected()) {
			System.out.println("radio button is selected");
		}
		else {
			System.out.println("radio button is not selected");
		}
		//driver.get("https://www.amazon.in");
		//WebElement Bar = driver.findElement(By.name("field-keywords"));
		//System.out.println(Bar.getTagName());
		
		//WebElement txt = driver.findElement(By.linkText("Sell"));
		//System.out.println(txt.getTagName());
		
		//System.out.println(txt.getAttribute("href"));
		//System.out.println(txt.getAttribute("class"));
		
		//System.out.println(txt.getAriaRole());
		//System.out.println(Bar.getAriaRole());
		
		//WebElement ele = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		//System.out.println(ele.getAriaRole());
		
		//WebElement link = driver.findElement(By.xpath("//a[text()=\"Fresh\"]"));
		//System.out.println(link.getDomAttribute("data-csa-c-slot-id"));
		//System.out.println(link.getDomProperty("autofocus"));
		
		//WebElement searchBar = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		//System.out.println(searchBar.getCssValue("color"));
		//System.out.println(searchBar.getCssValue("font-style"));
		//System.out.println(searchBar.getAccessibleName());
		
		/*WebElement lens = driver.findElement(By.cssSelector("#nav-search-submit-button"));
		System.out.println(lens.getAccessibleName());*/
		
		
		
		
		
	}}
		
		