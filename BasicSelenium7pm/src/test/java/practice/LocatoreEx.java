package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class LocatoreEx {
public void locatoreEx() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com/v1/");
	driver.manage().window().maximize();
	
	//driver.findElement(By.id("user-name")).sendKeys("standard_user");
	//driver.findElement(By.id("password")).sendKeys("secret_sauce");
	//driver.findElement(By.id("login-button")).click();
	
	driver.findElement(By.name("user-name")).sendKeys("standard_user");
	driver.findElement(By.name("password")).sendKeys("secret_sauce");
	driver.findElement(By.className("btn_action")).click();
	
}
}
