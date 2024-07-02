package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorEx {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		// Syntax-1
		//driver.findElement(By.cssSelector("[placeholder=\"Username\"]")).sendKeys("standard_user");
		//driver.findElement(By.cssSelector("[type=\"password\"]")).sendKeys("secret_sauce");
		//driver.findElement(By.cssSelector("[id=\"login-button\"]")).click();
        // Syntax-2
		//driver.findElement(By.cssSelector("input[placeholder=\"Username\"]")).sendKeys("standard_user");
	    // Syntax-3
		driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		//Syntax-4
		driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
		//Syntax-5
		//driver.findElement(By.cssSelector(".btn_action")).click();
		//Syntax-6
		driver.findElement(By.cssSelector("input.btn_action")).click();
	
	}

}
