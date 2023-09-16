package Pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Actitime_Task_Page
{
	public WebDriver driver;
	JavascriptExecutor js;
	
	@FindBy(xpath="//div[.='Add New']")
	private WebElement addnewbutton;
	
	@FindBy(xpath="//div[@class='item createNewCustomer']")
	private WebElement newcustomerlink;
	
	@FindBy(xpath="//div[@class='item createNewProject']")
	private WebElement newprojectlink;
	
	@FindBy(xpath="//div[@class='item createNewTasks']")
	private WebElement newtaskslink;
	
	@FindBy(xpath="//div[@class='item importTasks']")
	private WebElement importtaskslink;
	
	public Actitime_Task_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void addnewmethod()
	{
		js=(JavascriptExecutor)driver;
		  js.executeScript("arguments[0].click()",addnewbutton);
	}
	public void newcustomermethod()
	{
		js=(JavascriptExecutor)driver;
		  js.executeScript("arguments[0].click()", newcustomerlink);
	}
	public void newprojectmethod()
	{
		js=(JavascriptExecutor)driver;
		  js.executeScript("arguments[0].click()",newprojectlink );
	}
	public void newtasksmethod()
	{
		js=(JavascriptExecutor)driver;
		  js.executeScript("arguments[0].click()",newtaskslink );
	}
	public void importtasksmethod()
	{
		js=(JavascriptExecutor)driver;
		  js.executeScript("arguments[0].click()",importtaskslink );
	}
	

}
