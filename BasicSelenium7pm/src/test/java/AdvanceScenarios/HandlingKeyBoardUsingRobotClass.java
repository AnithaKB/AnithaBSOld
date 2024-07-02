package AdvanceScenarios;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingKeyBoardUsingRobotClass {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.amazon.in");
		driver.get("https:www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		/*driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bluetooth");
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);*/
		
		driver.findElement(By.className("form_input")).sendKeys("standard_user");
	    Robot rob = new Robot();
	   // rob.keyPress(KeyEvent.VK_TAB);
	   // rob.keyRelease(KeyEvent.VK_TAB);
	    
	   // driver.findElement(By.id("password")).sendKeys("secret_sauce");
	   // rob.keyPress(KeyEvent.VK_ENTER);
	   // rob.keyRelease(KeyEvent.VK_ENTER);
	    rob.keyPress(KeyEvent.VK_CONTROL);
	    rob.keyPress(KeyEvent.VK_A);
	    rob.keyRelease(KeyEvent.VK_CONTROL);
	    rob.keyRelease(KeyEvent.VK_A);
	    rob.keyPress(KeyEvent.VK_CONTROL);
	    rob.keyPress(KeyEvent.VK_C);
	    rob.keyRelease(KeyEvent.VK_CONTROL);
	    rob.keyRelease(KeyEvent.VK_C);
	    rob.keyPress(KeyEvent.VK_TAB);
	    rob.keyRelease(KeyEvent.VK_TAB);
	    rob.keyPress(KeyEvent.VK_CONTROL);
	    rob.keyPress(KeyEvent.VK_V);
	    rob.keyRelease(KeyEvent.VK_CONTROL);
	    rob.keyRelease(KeyEvent.VK_V);
	    
	    
		
	}

}
