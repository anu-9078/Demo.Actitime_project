package Pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Actitime_Setting 
{
  WebDriver driver;
  JavascriptExecutor js;
  
  @FindBy(xpath="(//div[@class='popup_menu_icon'])[2]")
  private WebElement settingsicon;
  
  @FindBy(xpath="//div[.='Turn Features On / Off']")
  private WebElement turnfeaturesicon;
  
  @FindBy(id="popup_menu_item_6")
  private WebElement generalsettingsicon;
  
  @FindBy(xpath="//a[.='Workflow Settings']")
  private WebElement workflowsettingsicon;
  
  @FindBy(xpath="//a[.='Types of Work']")
  private WebElement typesofworkicon;
  
  @FindBy(xpath="//a[.='Leave Types']")
  private WebElement leavetypesicon;
  
  @FindBy(xpath="//a[.='Notifications']")
  private WebElement notificationsicon;
  
  @FindBy(xpath="//a[.='Logo Settings']")
  private WebElement logosettingsicon;
  
  @FindBy(xpath="(//div[@class='item_title'])[4]")
  private WebElement licensesicon;
  
  public Actitime_Setting(WebDriver driver)
  {
	  this.driver=driver;
	  PageFactory.initElements(driver,this);
  }
  public void settings()
  {
	  js=(JavascriptExecutor)driver;
	  js.executeScript("arguments[0].click()",settingsicon);
  }
  public void turnfeatures()
  {
	  js=(JavascriptExecutor)driver;
	  js.executeScript("arguments[0].click()",turnfeaturesicon);
  }
  public void generalsettings()
  {
	  js=(JavascriptExecutor)driver;
	  js.executeScript("arguments[0].click()",generalsettingsicon);
  }
  public void workflowsettings()
  {
	  js=(JavascriptExecutor)driver;
	  js.executeScript("arguments[0].click()",workflowsettingsicon);
  }
  public void typesofwork()
  {
	  js=(JavascriptExecutor)driver;
	  js.executeScript("arguments[0].click()",typesofworkicon);
	  
  }
  public void leavetypes()
  {
	  js=(JavascriptExecutor)driver;
	  js.executeScript("arguments[0].click()",leavetypesicon);
  }
  public void notifications()
  {
	  js=(JavascriptExecutor)driver;
	  js.executeScript("arguments[0].click()",notificationsicon);
  }
  public void logosettings()
  {
	  js=(JavascriptExecutor)driver;
	  js.executeScript("arguments[0].click()",logosettingsicon);
  }
  public void licenses()
  {
	  js=(JavascriptExecutor)driver;
	  js.executeScript("arguments[0].click()",licensesicon);
  }
}
