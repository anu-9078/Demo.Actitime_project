package Pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Actitime_LoginPage 
{
	public WebDriver driver;
	JavascriptExecutor js;
	@FindBy(id="username")
	private WebElement usernametextfield;
	
	@FindBy(name="pwd")
	private WebElement passwordtextfield;
	
	@FindBy(id="keepLoggedInCheckBox")
    private WebElement checkbox;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginbutton;
	
	@FindBy(xpath="//a[.='Forgot your password?']")
	private WebElement forgottonpasswordLink;
	
	@FindBy(xpath="//a[.='actiTIME Inc.']")
	private WebElement inclink;
	
	public Actitime_LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void login()
	{
		usernametextfield.sendKeys("admin");
		passwordtextfield.sendKeys("manager");
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",checkbox);
		js.executeScript("arguments[0].click()",loginbutton);
		
	}
	public void forgotpassword()
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",forgottonpasswordLink);
		
	}
	public void inclink()
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",inclink);
	}
}
