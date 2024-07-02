package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CalendarPopupEx2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.goibibo.com/");
		
		Actions act = new Actions(driver);
		act.moveByOffset(20,30).click().perform();
		
		driver.findElement(By.xpath("//span[text()=\"Departure\"]")).click();
		driver.findElement(By.xpath("//div[text()=\"April 2024\"]/ancestor::div[@class=\"DayPicker-Month\"]/descendant::p[text()=\"20\"]")).click();

		driver.findElement(By.xpath("//span[text()=\"Return\"]")).click();
		driver.findElement(By.xpath("//div[text()=\"May 2024\"]/ancestor::div[@class=\"DayPicker-Month\"]/descendant::p[text()=\"15\"]")).click();
		
		
	}

}
