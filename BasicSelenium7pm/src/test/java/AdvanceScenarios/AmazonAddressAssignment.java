package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test

public class AmazonAddressAssignment {

	public void amazonAddressAssignment() throws Throwable {
        WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id=\"nav-link-accountList\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id=\"ap_email\"]")).sendKeys("anithabaskar29@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@id=\"continue\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Lakshkutty");
        driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
	}

}
