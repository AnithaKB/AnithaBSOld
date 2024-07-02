package PopUps;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

public class Assignment2AutomationTestingApp {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		driver.get("https://demo.automationtesting.in/Windows.html");

		driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		String mainId = driver.getWindowHandle();
		
		Set<String> allList = driver.getWindowHandles();
		
		for (String win : allList) 
		{
			if(!mainId.equals(win)) 
			{
				driver.switchTo().window(win);
				driver.findElement(By.xpath("//span[text()='Downloads']")).click();
			}
		}
				
		
	}

}
