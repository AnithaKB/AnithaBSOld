package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleAttributes {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//a[@data-csa-c-slot-id='nav_cs_2' and @data-csa-c-type='link']")).click();
		//driver.findElement(By.xpath("//a[text()=' Electronics ' and @class='nav-a  ']")).click();
		//driver.findElement(By.xpath("//input[@type='text' or @id='twotabsearchtextbox']")).sendKeys("nike");
		driver.findElement(By.xpath("//a[text()=\"Sell\" or contains(@data-csa-c-id,\"l8sum3-112fqb-q9czl0-s7lg8j\")]")).click();

	}

}
