package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDropDownUsingKeysClass {

	public static void main(String[] args) throws Throwable {
        WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		WebElement daylist = driver.findElement(By.name("birthday_day"));
		daylist.click();
		daylist.sendKeys(Keys.ARROW_DOWN);
		daylist.sendKeys(Keys.ARROW_DOWN);
		WebElement monthlist = driver.findElement(By.name("birthday_month"));
		monthlist.click();
		monthlist.sendKeys(Keys.ARROW_UP);
		monthlist.sendKeys(Keys.ARROW_UP);
		monthlist.sendKeys(Keys.ARROW_UP);
		Thread.sleep(1000);
		WebElement yearlist = driver.findElement(By.name("birthday_year"));
		yearlist.click();
		yearlist.sendKeys(Keys.ARROW_DOWN);
		yearlist.sendKeys(Keys.ARROW_DOWN);
		yearlist.sendKeys(Keys.ARROW_DOWN);
		yearlist.sendKeys(Keys.ARROW_DOWN);
		
	}

}
