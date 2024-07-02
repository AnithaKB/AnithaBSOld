package practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.sourceforge.tess4j.Tesseract;

public class HandlingCaptchaEx {

	public static void main(String[] args) throws Throwable {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@class=\"h_menu_drop_button hidden-xs\"]")).click();
		driver.findElement(By.xpath("//button[text()=\"LOGIN\"]")).click();
		
		WebElement captcha = driver.findElement(By.xpath("//img[@class=\"captcha-img\"]"));
		
		TakesScreenshot ts = (TakesScreenshot)captcha;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./CaptchaScreenshot.png");
		FileUtils.copyFile(src, dest);
		
		Tesseract tss = new Tesseract();
		tss.setDatapath("D:\\ANITHA\\BASIC SELENIUM\\BS NOTES\\captcha\\Tess4J\\tessdata");
		String st = tss.doOCR(dest);
		String img = st.replaceAll(" ", "");
		System.out.println(img);
		
		driver.findElement(By.xpath("//input[@name=\"captcha\"]")).sendKeys(img);
		
		

	}

}
