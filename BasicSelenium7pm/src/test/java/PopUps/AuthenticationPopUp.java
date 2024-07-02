package PopUps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class AuthenticationPopUp {

	public void authenticationPopUp() {
		WebDriver driver=new ChromeDriver();
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();

		// syntax:- https://username:password@Url
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	}

}
