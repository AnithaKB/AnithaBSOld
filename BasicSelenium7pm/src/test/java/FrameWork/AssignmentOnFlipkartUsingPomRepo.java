package FrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POMRepo.Flipkart;

public class AssignmentOnFlipkartUsingPomRepo {

	@Test
	public void assignmentOnFlipkartUsingPomRepo() {
		WebDriver driver=new ChromeDriver();
		driver.get("https:www.flipkart.com");
		driver.manage().window().maximize();
		Flipkart flp = new Flipkart(driver);
		
		flp.getSearchTextfield().sendKeys("iphone");
		

	}

}
