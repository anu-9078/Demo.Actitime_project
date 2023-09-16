package Pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Actitime_Homepage 
{
public WebDriver driver;
JavascriptExecutor js;
  
@FindBy(xpath="//div[@class='logoSwitcherText']")
private  WebElement switchtoactiplantext;

@FindBy(id="container_tt")
private WebElement entertimetrackcontent;

@FindBy(id="container_tasks")
private WebElement viewtimetrackcontent;

@FindBy(id="container_reports")
private WebElement locktimetrackcontent;

@FindBy(id="container_users")
private WebElement approvetimetrackcontent;

@FindBy(xpath="(//div[@class='menu_icon'])[1]")
private WebElement calendersicon;

@FindBy(xpath="(//div[@class='menu_icon'])[2]")
private WebElement settingsicon;

@FindBy(xpath="(//div[@class='menu_icon'])[3]")
private WebElement integrationsicon;

@FindBy(xpath="(//div[@class='menu_icon'])[4]")
private WebElement helpandsupporticon;

@FindBy(xpath="(//div[@class='popup_menu_icon'])[5]")
private WebElement popupmenuicon;

@FindBy(xpath="//a[@class='userProfileLink username ']")
private WebElement userprofilelink;

@FindBy(xpath="//a[.='Logout']")
private WebElement logoutlink;

public Actitime_Homepage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
public void actiplans()
{    
	js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()",switchtoactiplantext);
	
	}
public void entertimetrack()
{
	js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()",entertimetrackcontent);
	}
public void viewtimetrack()
{
	js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()",viewtimetrackcontent);
	}
public void locktimetrack()
 {
	js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()",locktimetrackcontent);
  }
public void approvetimetrack()
{
	js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()",approvetimetrackcontent);
	}
public void calenders()
{
	js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()",calendersicon);
}
public void settings()
{
	js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()",settingsicon);
	}
public void integrations()
{
	js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()",integrationsicon);
	}
public void helpandsupport()
{
	js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()",helpandsupporticon);
	}
public void popupmenu()
{
	js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()",popupmenuicon);
	}
public void userprofile()
{
	js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()",userprofilelink);
	
	}
public void logout()
{ 
	js=(JavascriptExecutor)driver;
js.executeScript("arguments[0].click()",logoutlink);
	}
}
