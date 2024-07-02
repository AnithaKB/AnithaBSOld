package practice;

import java.awt.Window;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
//case 2:-selenium server:-3.141.59 Webdriver version:-5.7.0
public class LaunchingBrowser {
public static void main(String [] args) {
	//WebDriverManager.edgedriver().setup();
	//WebDriver driver=new EdgeDriver();
//case3:- Selenium version:-4.18.1
WebDriver driver=new EdgeDriver();	
driver.get("https://www.amazon.com");
String title = driver.getTitle();
//System.out.println(title);
String url = driver.getCurrentUrl();
//System.out.println(url);
String source = driver.getPageSource();
//System.out.println(source);
Options opt = driver.manage();
org.openqa.selenium.WebDriver.Window win = opt.window();
win.fullscreen();
//driver.manage().window().maximize();
//driver.manage().window().minimize();
}
}
