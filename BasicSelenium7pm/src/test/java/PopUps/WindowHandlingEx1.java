package PopUps;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
@Test
public class WindowHandlingEx1 {

	public void windowHandlingEx1() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com/");
		
		WebElement ele = driver.findElement(By.xpath("//div[text()='Jobs']"));
	    Actions act = new Actions(driver);
	    act.moveToElement(ele).perform();
	    
	    driver.findElement(By.xpath("//div[text()='IT jobs']")).click();
	    driver.findElement(By.xpath("//div[text()='Services']")).click();
	    
	    //driver.findElement(By.xpath("//span[text()='RESUME WRITING']")).click();
	
	    String mainId = driver.getWindowHandle();
	    System.out.println(mainId);
	    
	    Set<String> allIds = driver.getWindowHandles();
	    System.out.println(allIds);
	    
	    for (String win : allIds) {
			if(!mainId.equals(win))
			{
				driver.switchTo().window(win);
				driver.findElement(By.xpath("//span[text()='RESUME WRITING']")).click();
			}		
		} 
	}
}
