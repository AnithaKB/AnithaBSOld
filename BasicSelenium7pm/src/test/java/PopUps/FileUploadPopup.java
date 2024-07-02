package PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUploadPopup {
@Test
	public void fileUploadPopup() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/upload");
		
		driver.findElement(By.id("file-upload")).sendKeys("D:\\ANITHA\\BASIC SELENIUM\\BS NOTES\\BS(Intro-7pm).txt");
		
		driver.findElement(By.id("file-submit")).click();

	}

}
