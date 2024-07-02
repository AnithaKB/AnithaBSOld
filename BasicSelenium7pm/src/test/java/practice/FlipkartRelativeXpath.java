package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartRelativeXpath {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com");
	driver.manage().window().maximize();

    //driver.findElement(By.xpath("//img[@alt=\"Grocery\"]")).click();
	//driver.findElement(By.xpath("//span[text()=\"Grocery\"]")).click();
	driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("iphone");
	driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	String name = driver.findElement(By.xpath("//div[contains(text(),\"Apple iPhone 15 (Blue, 128 G\")]")).getText();
	System.out.println(name);
	String price = driver.findElement(By.xpath("(//div[contains(text(),\"₹66,999\")])[1]")).getText();
	System.out.println(price);
}
}
