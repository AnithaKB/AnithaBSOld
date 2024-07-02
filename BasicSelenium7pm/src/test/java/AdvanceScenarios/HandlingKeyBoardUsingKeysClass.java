package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingKeyBoardUsingKeysClass {


@Test
        public void handlingKeyBoardUsingKeysClass() throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		//Normal Approach
		//driver.findElement(By.id("user-name")).sendKeys("standard_user");
		//driver.findElement(By.id("password")).sendKeys("secret_sauce",Keys.ENTER);
        //case-1
		//driver.findElement(By.id("user-name")).sendKeys("standard_user",Keys.TAB,"secret_sauce",Keys.ENTER);
		
		//case-2
		WebElement un = driver.findElement(By.id("user-name"));
		un.sendKeys("standard_user",Keys.CONTROL, "a" );
		un.sendKeys(Keys.CONTROL, "c");
		Thread.sleep(2000);
		WebElement pw = driver.findElement(By.id("password"));
		pw.sendKeys(Keys.CONTROL, "v");
		
	}

}
