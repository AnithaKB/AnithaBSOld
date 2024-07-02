package FrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InsertDataToProperties_File {

	public static void main(String[] args) throws Throwable {
		
		
		FileInputStream fis = new FileInputStream("./Properties_Files.properties.txt"); //read mode
		//Inserting data to Properties_File
		Properties pro = new Properties();
		pro.load(fis);
		pro.setProperty("url", "https://www.saucedemo.com/v1/");
		pro.setProperty("username", "standard_user");
		pro.setProperty("password", "secret_sauce");
		
		FileOutputStream fos = new FileOutputStream("./Properties_Files.properties.txt"); //write mode
		pro.store(fos, "COMMONDATE");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
        FileInputStream fis1 = new FileInputStream("./Properties_Files.properties.txt");
		
		//Load data into properties class
		Properties pro1 = new Properties();
		pro1.load(fis1);
		String URL = pro1.getProperty("url");
		String USERNAME = pro1.getProperty("username");
		String PASSWORD = pro1.getProperty("password");
		driver.get(URL);
		driver.findElement(By.id("user-name")).sendKeys(USERNAME);
		driver.findElement(By.id("password")).sendKeys(PASSWORD);
		driver.findElement(By.id("login-button")).click();


	}

}
