package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class RelativeXpathPractice {
public void relativeXpathPractice() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com/v1/");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("standard_user");
	driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("secret_sauce");
	driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();			
}
}
