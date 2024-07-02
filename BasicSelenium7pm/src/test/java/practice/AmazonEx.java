package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonEx {
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	
	
	 // driver.findElement(By.name("field-keywords")).sendKeys("nike");
	  //driver.findElement(By.id("nav-search-submit-button")).click();
	  //driver.findElement(By.linkText("Amazon miniTV")).click();
	  //driver.findElement(By.partialLinkText("Amazon mi")).click();
	//driver.findElement(By.partialLinkText("Today's De")).click();
	  //driver.findElement(By.cssSelector("[data-csa-c-slot-id=\"nav-link-accountList\"]")).click();
     // driver.findElement(By.cssSelector("[data-csa-c-content-id=\"nav_cs_mobiles\"]")).click();
	
	
	//driver.findElement(By.cssSelector("[name=\"field-keywords\"]")).sendKeys("note");
	//driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
	//String txt = driver.findElement(By.cssSelector("[alt=\"Redmi Note 13 5G (Stealth Black, 8GB RAM, 256GB Storage) | 5G Ready | 120Hz Bezel-Less AMOLED | 7.mm Slimmest Note Ever | ...\"]")).getText();
	//System.out.println(txt);
	//driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("bluetooth mouse");
	driver.findElement(By.xpath("//input[contains(@type,\"te\")]")).sendKeys("bluetooth mouse");
	driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
	String mouseName = driver.findElement(By.xpath("//span[text()=\"RAPOO MT750S Wireless Mouse with High-Precision Sensor, Easy-Switch Up to 4 Devices, Ergonomic Design, Rechargeable Bluetooth Mice with 4 Levels Adjustable DPI, Black\"]")).getText();
	System.out.println(mouseName);
	String price = driver.findElement(By.xpath("(//span[@class=\"a-price-whole\"])[4]")).getText();
	System.out.println(price);
	
	}}
