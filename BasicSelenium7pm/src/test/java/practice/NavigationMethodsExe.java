package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class NavigationMethodsExe {
public void navigationMethodsExe() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.navigate().to("https://www.amazon.com");
	
	Thread.sleep(1000);
	driver.navigate().back();
	
	Thread.sleep(1000);
	driver.navigate().forward();
	
	Thread.sleep(1000);
	driver.navigate().refresh();
	
}
}
