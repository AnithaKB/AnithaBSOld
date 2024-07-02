package PopUps;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentProKabbadiPointsTable2022 {

	
	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]")).sendKeys("Pro Kabaddi points table 2022",Keys.ENTER);
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath("//tbody/tr[@class=\"tsp-trtb tsp-rr tsp-cbd tsp-hbd\"]"));
       
        for (WebElement team : list) {
        	if(team.getText().contains("Delhi")) 
            { 
	            team.click();
	            Thread.sleep(2000);
        		System.out.println(team.getText());
	            
            }
	        }
            }
	        }
	

	

	


 

