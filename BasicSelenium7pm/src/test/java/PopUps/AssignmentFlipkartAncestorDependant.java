package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentFlipkartAncestorDependant {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//input[@placeholder=\"Search for Products, Brands and More\"]")).sendKeys("iphone");
		driver.findElement(By.xpath("//button[@class=\"_2iLD__\"]")).click();
		
		String ele = driver.findElement(By.xpath("//div[text()=\"Apple iPhone 15 (Blue, 128 GB)\"]/ancestor::div[@class=\"yKfJKb row\"]/descendant::div[text()=\"₹71,999\"]")).getText();
		System.out.println(ele);
	}

}
