package FrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POMRepo.Flipkart;


public class FlipkartImp {

	public static void main(String[] args) {

			
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com");
	driver.manage().window().maximize();
		
	Flipkart flp = new Flipkart(driver);
	//flp.getSearchTextfield().sendKeys("Nike");

	flp.methodText("Bluetooth");
	flp.icon();
	
	}

	

}
