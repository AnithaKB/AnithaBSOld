package PopUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentProKabbadiMamFormat {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.prokabaddi.com/standings");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String teamName = "Bengaluru Bulls";
		
		WebElement point = driver.findElement(By.xpath("//p[text()='"+teamName+"']/ancestor::div[@class='table-data team']"
				+ "/following-sibling::div[@class='table-data matches-play']"));
		System.out.println(point.getText());
		WebElement won = driver.findElement(By.xpath("//p[text()='"+teamName+"']/ancestor::div[@class='table-data team']"
				+ "/following-sibling::div[@class='table-data matches-won']"));
		System.out.println(won.getText());
		WebElement lost = driver.findElement(By.xpath("//p[text()='"+teamName+"']/ancestor::div[@class='table-data team']"
				+ "/following-sibling::div[@class='table-data matches-lost']"));
		System.out.println(lost.getText());
		WebElement draw = driver.findElement(By.xpath("//p[text()='"+teamName+"']/ancestor::div[@class='table-data team']"
				+ "/following-sibling::div[@class='table-data matches-draw']"));
		System.out.println(draw.getText());
		WebElement diff = driver.findElement(By.xpath("//p[text()='"+teamName+"']/ancestor::div[@class='table-data team']"
				+ "/following-sibling::div[@class='table-data score-diff']"));
		System.out.println(diff.getText());


	}

}
