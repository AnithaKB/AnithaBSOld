package practice;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BigBasketAssignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.BigBasket.com");
		driver.manage().window().maximize();		
		//Case-1 Direct input in textfield
		/*driver.findElement(By.xpath("(//input[@class=\"flex-1 w-full leading-md lg:text-sm xl:text-md placeholder-silverSurfer-700\"])[2]")).sendKeys("Apples");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[text()=\"Add\"])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(@id,\"increment\")]")).click();*/
		//driver.findElement(By.xpath("(//input[@class=\"flex-1 w-full leading-md lg:text-sm xl:text-md placeholder-silverSurfer-700\"])[2]")).sendKeys("Apples",Keys.ENTER);
		
		//Case-2 Formal method of taking the first visible product-apple 
		
		driver.findElement(By.xpath("(//input[@placeholder=\"Search for Products...\"])[1]")).sendKeys("Apple",Keys.ENTER);
		Thread.sleep(3000);

		JavascriptExecutor js=(JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.xpath("(//button[text()='Add' and @pattern='outline'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class=\"Button-sc-1dr2sn8-0 dcJzPv CtaOnDeck___StyledButton2-sc-orwifk-3 GGExL group CtaOnDeck___StyledButton2-sc-orwifk-3 GGExL group\"]")).click();
		
		/*String name = driver.findElement(By.xpath("//span[contains(text(),\"Apple - Royal Gala Economy\")]")).getText();
        System.out.println(name);
		String price = driver.findElement(By.xpath("(//span[contains(@class,\"Label-sc-15v1nk5-0 QuickSearch___StyledLabel4-sc-rtz2vl-9 gJxZPQ gpRcpM\")])[1]")).getText();
		System.out.println(price);*/

}}
