package PopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertPopUp {
@Test
	public void alertPopUp() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		/*driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Alert alt = driver.switchTo().alert();
		alt.accept();*/
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Alert alt = driver.switchTo().alert();
		//alt.dismiss();
		String txt = alt.getText();
		System.out.println(txt);
	
//		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
//		Alert alt = driver.switchTo().alert();
//		alt.sendKeys("ThankYou!!!");
//		alt.accept();
		
		

	}

}
