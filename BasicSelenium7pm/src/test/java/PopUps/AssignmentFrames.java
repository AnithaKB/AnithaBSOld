package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentFrames {

	public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			
			driver.get("https://demo.automationtesting.in/Frames.html ");
			//Frame switching using index
			//driver.switchTo().frame(1);
			//driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Anitha");
			
			//Frame switching using id()
			//driver.switchTo().frame("singleframe");
			//driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Anitha");
			
			//Frame switching using name()
			//driver.switchTo().frame("SingleFrame");
			//driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Anitha");
	
			//Frame switching using Webelement
			WebElement ele = driver.findElement(By.xpath("//iframe[@id=\"singleframe\"]"));
			driver.switchTo().frame(ele);
			driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Anitha");
	}

}
