package POMRepo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class MultipleWebElements {

	public MultipleWebElements(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void multipleWebElements(WebDriver driver) throws Throwable
	{	
		List<WebElement> eleList = driver.findElements(By.xpath("//div[@class='left-pane-results-container']//div//div//div"));
		Thread.sleep(1000);
		for (WebElement sugg : eleList) {
			String Element = sugg.getText();
			if(Element.contains("nike shoes for women")) {
				sugg.click();
				break;
			}
			System.out.println(Element);
	}
	}
	}
