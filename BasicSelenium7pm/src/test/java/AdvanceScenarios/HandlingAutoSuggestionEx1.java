package AdvanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class HandlingAutoSuggestionEx1 {

	public void handlingAutoSuggestionEx1() throws Throwable {
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.flipkart.com");
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.name("field-keywords")).sendKeys("nike");
		Thread.sleep(1000);
		/*List<WebElement> eleList = driver.findElements(By.xpath("//ul[@class='_1sFryS _2x2Mmc _3ofZy1']//li"));
		Thread.sleep(1000);
		for (WebElement list : eleList) {
			
			String Element = list.getText();
			if(Element.contains("in Men’s Casual Shoes")){
				list.click();
				break;
			}
			
			System.out.println(Element);
		}*/
		List<WebElement> eleList = driver.findElements(By.xpath("//div[@class='left-pane-results-container']//div//div//div"));
		Thread.sleep(1000);
		for (WebElement sugg : eleList) {
			String Element = sugg.getText();
			Thread.sleep(1000);
			if(Element.contains("nike shoes for women")) {
				sugg.click();
				break;
			}
			System.out.println(Element);
		}
		
	}

}
