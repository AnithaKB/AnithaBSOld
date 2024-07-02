package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDownUsingSelectClass {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(3000);
		WebElement daylist = driver.findElement(By.name("birthday_day"));
		//Select by Index--> Index value starts with 0
		Select sel = new Select(daylist);
		//sel.selectByIndex(19);
		sel.selectByVisibleText("11");
		
		
		WebElement monthlist = driver.findElement(By.name("birthday_month"));
		
		Select sele = new Select(monthlist);
		//sele.selectByIndex(1);
		sele.selectByValue("12");
		//sele.selectByVisibleText("Nov");
		
		
		WebElement yearlist = driver.findElement(By.name("birthday_year"));
		
		Select selec = new Select(yearlist);
		selec.selectByIndex(14);
		//selec.selectByValue("1930");
		//selec.selectByVisibleText("1977");

	}

}
