package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		WebElement searchBar = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		//searchBar.sendKeys("puma");
		//searchBar.click();
		//searchBar.submit();
		
		//Thread.sleep(3000);
		//searchBar.clear();
		//searchBar.sendKeys("bluetooth");
		WebElement dim = driver.findElement(By.xpath("//a[text()=\"Fresh\"]"));
		System.out.println(dim.getLocation().getX());
		System.out.println(dim.getLocation().getY());
		System.out.println(dim.getSize().getHeight());
		System.out.println(dim.getSize().getWidth());
		
		System.out.println(dim.getRect().getX());
		System.out.println(dim.getRect().getY());
		System.out.println(dim.getRect().getHeight());
		System.out.println(dim.getRect().getWidth());
		
	}

}
