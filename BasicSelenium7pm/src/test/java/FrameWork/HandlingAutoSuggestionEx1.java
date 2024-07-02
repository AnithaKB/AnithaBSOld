package FrameWork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import POMRepo.MultipleWebElements;

public class HandlingAutoSuggestionEx1 {

	public static void main(String[] args) throws Throwable {
		

				WebDriver driver=new ChromeDriver();
				//driver.get("https://www.flipkart.com");
				driver.get("https://www.amazon.in");
				driver.manage().window().maximize();
				driver.findElement(By.name("field-keywords")).sendKeys("nike");
				Thread.sleep(1000);
//				List<WebElement> eleList = driver.findElements(By.xpath("//div[@class='left-pane-results-container']//div//div//div"));
//				Thread.sleep(1000);
//				for (WebElement sugg : eleList) {
//					String Element = sugg.getText();
//					if(Element.contains("nike shoes for women")) {
//						sugg.click();
//						break;
//					}
//					System.out.println(Element);}
		
				MultipleWebElements elements=new MultipleWebElements(driver);
				elements.multipleWebElements(driver);
	}
	
}

