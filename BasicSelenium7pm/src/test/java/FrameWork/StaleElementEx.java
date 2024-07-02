package FrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StaleElementEx {

	@Test
	public void staleElementEx() {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("[type=\"password\"]")).sendKeys("secret_sauce");
		WebElement login = driver.findElement(By.className("btn_action"));
		driver.navigate().refresh();
		login.click();
        
	}

}
