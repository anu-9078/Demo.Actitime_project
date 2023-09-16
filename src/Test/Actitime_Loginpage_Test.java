package Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pom.Actitime_Homepage;
import Pom.Actitime_LoginPage;

public class Actitime_Loginpage_Test {

	@Test
	public void m(){
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://demo.actitime.com");
	
			
	Actitime_LoginPage login=new Actitime_LoginPage(driver);
	login.login();
	Actitime_Homepage homepage=new Actitime_Homepage(driver);
	homepage.logout();
	}

}
