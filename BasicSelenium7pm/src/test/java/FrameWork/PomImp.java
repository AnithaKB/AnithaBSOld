package FrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POMRepo.LoginPage;

public class PomImp {

	public static void main(String[] args) throws Throwable  {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		//properties_File
		//Step 1 - Path Connection
		//FileInputStream fis = new FileInputStream("D:\\ANITHA\\BASIC SELENIUM\\PROGRAM\\Properties_Files.properties.txt");
		FileInputStream fis = new FileInputStream("./Properties_Files.properties.txt");
		
		//Load data into properties class
		Properties pro = new Properties();
		pro.load(fis);
		String URL = pro.getProperty("url");
		String USERNAME = pro.getProperty("username");
		String PASSWORD = pro.getProperty("password");
		driver.get(URL);
		/*driver.findElement(By.id("user-name")).sendKeys(USERNAME);
		driver.findElement(By.id("password")).sendKeys(PASSWORD);
		driver.findElement(By.id("login-button")).click();*/
        
		//Implementing using POM class
		/*LoginPage login=new LoginPage(driver);	
		login.getUserTextField().sendKeys(USERNAME);
		login.getPasswordTextField().sendKeys(PASSWORD);
		login.getLoginButton().click();*/
		
		LoginPage login=new LoginPage(driver);
		login.loginToApp(USERNAME, PASSWORD);

	}

}
