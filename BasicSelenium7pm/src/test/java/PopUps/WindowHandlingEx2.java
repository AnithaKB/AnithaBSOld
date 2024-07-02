package PopUps;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandlingEx2 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		driver.get("https://demo.automationtesting.in/Windows.html");

		driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

		Set<String> winList = driver.getWindowHandles();
	    System.out.println(winList);
		for (String win : winList) 
		{
			driver.switchTo().window(win);
			Thread.sleep(1000);
			String title = driver.getTitle();
			System.out.println(title);
			Thread.sleep(2000);
			if(title.contains("Selenium")) 
			{
				break;
			}
		}
		
			driver.findElement(By.xpath("//a[text()='Register now!']")).click();
//-----------------------------------------------------------------------------------			
			Set<String> winList1 = driver.getWindowHandles();
		    System.out.println(winList1);
			for (String win1 : winList1) 
			{
				driver.switchTo().window(win1);
				Thread.sleep(1000);
				String title1 = driver.getTitle();
				System.out.println(title1);
				Thread.sleep(2000);
				if(title1.contains("Selenium Conf 2024")) 
				{
					break;
				}
				
			}
				
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.moveByOffset(20, 30).click().perform();
		driver.findElement(By.xpath("//a[text()='Register Now']")).click();
		
		Set<String> winList2 = driver.getWindowHandles();
	    System.out.println(winList2);
		for (String win2 : winList2) 
		{
			driver.switchTo().window(win2);
			Thread.sleep(1000);
			String title2 = driver.getTitle();
			System.out.println(title2);
			Thread.sleep(2000);
			if(title2.contains("Frames & windows")) 
			{
				break;
			}
		}
		driver.close();
		
		
		}
	}


