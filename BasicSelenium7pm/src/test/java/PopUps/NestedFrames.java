package PopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/frames ");
        driver.findElement(By.xpath("//a[text()=\"Nested Frames\"]")).click();
        WebElement topFrame = driver.findElement(By.xpath("//frame[@name=\"frame-top\"]"));
        driver.switchTo().frame(topFrame);
        
        WebElement leftFrame = driver.findElement(By.xpath("//frame[@name=\"frame-left\"]"));
        driver.switchTo().frame(leftFrame);
        String left = driver.findElement(By.xpath("//body[contains(text(),'LEFT')]    ")).getText();
        System.out.println(left);
        
        driver.switchTo().parentFrame();
        WebElement middle = driver.findElement(By.xpath("//frame[@name='frame-middle']"));
        
        driver.switchTo().frame(middle);
        String ele = driver.findElement(By.xpath("//div[text()='MIDDLE']")).getText();
        System.out.println(ele);
        
        //driver.switchTo().parentFrame();
        //driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();
        WebElement bottom = driver.findElement(By.xpath("//frame[@name=\"frame-bottom\"]"));
        driver.switchTo().frame(bottom);
        String elem = driver.findElement(By.xpath("//body[contains(text(),\"BOTTOM\")]")).getText();
        System.out.println(elem);
        
	}

}
