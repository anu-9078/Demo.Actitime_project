package Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pom.Actitime_Leave_Type_Page;
import Pom.Actitime_LoginPage;
import Pom.Actitime_Setting;

public class ActitimeLeaveTypePage {
@Test
	public static void m2() {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://demo.actitime.com");
	
	Actitime_LoginPage login=new Actitime_LoginPage(driver);
	login.login();
	Actitime_Setting setting=new Actitime_Setting(driver);
	setting.settings();
	setting.leavetypes();
	Actitime_Leave_Type_Page typepage=new Actitime_Leave_Type_Page(driver);
	typepage.createleavetype();
	typepage.leavetype();
	typepage.createleavetype1();
	typepage.delete();
}

}
