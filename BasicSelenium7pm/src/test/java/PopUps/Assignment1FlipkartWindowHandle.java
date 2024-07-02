package PopUps;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1FlipkartWindowHandle {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.flipkart.com");
	    driver.findElement(By.xpath("//input[@placeholder=\"Search for Products, Brands and More\"]")).sendKeys("bluetooth");
		driver.findElement(By.xpath("//button[@class=\"_2iLD__\"]")).click();
		driver.findElement(By.xpath("//a[@title='Mivi DuoPods i4 TWS,Quad-mic ENC,13mm Bass,50+ Hrs Playtime,low latency,Type C,5.3 Bluetooth Headset']")).click();

		String main = driver.getWindowHandle();
 
		Set<String> all = driver.getWindowHandles();
		
		for (String one : all) {
			if(main!=one)
			{
			Thread.sleep(2000);
			driver.switchTo().window(one);
			Thread.sleep(2000);
			WebElement name = driver.findElement(By.xpath("//a[.='Mivi DuoPods i4 TWS,Quad-mic ENC,13mm Bass,50+ Hrs Play...']"));
			Thread.sleep(2000);
			System.out.println(name.getText());
	
			}
			
		}
	}

}
