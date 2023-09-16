package Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pom.Actitime_Homepage;
import Pom.Actitime_LoginPage;
import Pom.Actitime_Setting;
import Pom.Actitime_Task_Page;
import Pom.Actitime_Type_Of_Work;

public class CreateCustomerTest {
@Test
	public static void m3() {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.actitime.com");
		
		Actitime_LoginPage login=new Actitime_LoginPage(driver);
		login.login();
		
		Actitime_Homepage click=new Actitime_Homepage(driver);
		//click.viewtimetrack();
		click.settings();
		
		Actitime_Setting setting=new Actitime_Setting(driver);
		setting. typesofwork();
		
		Actitime_Type_Of_Work type=new Actitime_Type_Of_Work(driver);
		type.createtypework();
		 
		//Actitime_Task_Page task=new Actitime_Task_Page(driver);
		//task.addnewmethod();
		//task.newcustomermethod();

	}

}
