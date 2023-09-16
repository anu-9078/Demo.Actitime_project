package Pom;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actitime_Leave_Type_Page 
{
	public WebDriver driver;
   WebDriverWait wait;
  JavascriptExecutor js;
  
  @FindBy(xpath="//span[.='Create Leave Type']")
  private WebElement createleavetypebutton;
  
  @FindBy(xpath="//input[@id='leaveTypeLightBox_nameField']")
  private WebElement leavetypenametextfield;
  
  @FindBy(xpath="//div[@class='buttonIcon']")
  private WebElement createleavetypebuttonn1;
  
  @FindBy(xpath="//span[.='Anu']/../../../../../..//td[contains(@class,'leaveTypeDeleteCell last')]")
  private WebElement deletebutton;
  
  public Actitime_Leave_Type_Page(WebDriver driver)
  {
	  this.driver=driver;
	  PageFactory.initElements(driver,this);
  }
  public void createleavetype()
  {
	  js=(JavascriptExecutor)driver;
	  wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	  wait.until(ExpectedConditions.visibilityOf(createleavetypebutton));
	  js.executeScript("arguments[0].click()",createleavetypebutton);
  }
  public void leavetype()
  {
	  js=(JavascriptExecutor)driver;
	  wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	  wait.until(ExpectedConditions.visibilityOf(leavetypenametextfield));
	  js.executeScript("arguments[0].click()",leavetypenametextfield);
	  leavetypenametextfield.sendKeys("Anu");
	  
  }
  public void createleavetype1()
  {
	  js=(JavascriptExecutor)driver;
	  wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	  wait.until(ExpectedConditions.visibilityOf(createleavetypebuttonn1));
	  js.executeScript("arguments[0].click()",createleavetypebuttonn1);
	  
  }
  public void delete()
  {
	  js=(JavascriptExecutor)driver;
	  wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	  wait.until(ExpectedConditions.visibilityOf(deletebutton));
	  js.executeScript("arguments[0].click()",deletebutton);
	  driver.switchTo().alert().accept();
  }
  
}
