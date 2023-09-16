package Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pom.Actitime_LoginPage;
import Pom.Actitime_Setting;
import Pom.Actitime_Type_Of_Work;
import Pom.CreateNewTypeOfWorkPage;

public class Actitime_settings_Test {
@Test
	public static void m1(){
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Actitime_LoginPage login=new Actitime_LoginPage(driver);
		login.login();
		Actitime_Setting setting=new Actitime_Setting(driver);
		setting.settings();
		setting.typesofwork();
		Actitime_Type_Of_Work  click= new Actitime_Type_Of_Work(driver) ;
		click.createtypework();
		CreateNewTypeOfWorkPage workpage=new CreateNewTypeOfWorkPage(driver);
		workpage.name();
		workpage.createtypework();
		click.delete();
		

	}

}
