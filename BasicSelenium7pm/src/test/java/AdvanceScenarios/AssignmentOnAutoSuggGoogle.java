package AdvanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOnAutoSuggGoogle {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("selenium");
		Thread.sleep(1000);
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='G43f7e']//li"));
		Thread.sleep(1000);
		for (WebElement sugg : list) {
		
			System.out.println(sugg.getText());
			if(sugg.getText().contains("selenium webdriver")) {
				sugg.click();
				break;
			}
		}
	}
}
