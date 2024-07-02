package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAllProductAndPriceList {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("field-keywords")).sendKeys("oneplus");
		driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
		
		List<WebElement> allName = driver.findElements(By.xpath("//span[@class=\"a-size-medium a-color-base a-text-normal\"]"));
		
		int count=0;
       for(WebElement name:allName)  
       {
    	   
    	   System.out.println(name.getText());
    	   count++;
       }
       System.out.println("the total no. of mobiles:"+count);
       
       List<WebElement> allPrice = driver.findElements(By.xpath("//span[@class=\"a-price-whole\"]"));
       
       for(WebElement price:allPrice) {
    	   System.out.println(price.getText());
    	   
       }
	}
	}


