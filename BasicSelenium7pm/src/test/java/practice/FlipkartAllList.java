package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAllList {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("iphone");
		driver.findElement(By.xpath("//button[@class=\"_2iLD__\"]")).click();
		
		List<WebElement> allNames = driver.findElements(By.xpath("//div[@class=\"_4rR01T\"]"));
		
		int count=0;
		for(WebElement name:allNames)
		{
		System.out.println(name.getText());
        count++;
	}
		System.out.println("Total no. of PhoneName:"+count);
	}
}
