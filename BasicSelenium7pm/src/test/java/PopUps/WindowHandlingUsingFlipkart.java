package PopUps;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingUsingFlipkart {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		
		driver.findElement(By.name("q")).sendKeys("puma",Keys.ENTER);
		driver.findElement(By.xpath("//a[text()='Luke V1 Men Flip Flops']")).click();
		
		Set<String> winList = driver.getWindowHandles();
		
		for (String win : winList) 
		{
			driver.switchTo().window(win);
			String title = driver.getTitle();
			System.out.println(title);
			if(title.contains("Luke V1 Men Flip Flops")) {
				break;
			}
		}
		String price = driver.findElement(By.xpath("//div[text()='₹594']")).getText();
		System.out.println(price);



	}

}
