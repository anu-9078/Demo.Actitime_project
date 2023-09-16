package Pom;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateCustomerPage 
{
  public WebDriver driver;
  WebDriverWait wait;
  JavascriptExecutor js;
  
  @FindBy(xpath="(//input[@autocomplete='off'])[2]")
  private WebElement customernametextfield;
  
  @FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
  private WebElement customerdescriptionfield;
  
  @FindBy(xpath="//div[.='Create Customer']")
  private WebElement createcustomerbutton;
  
  public CreateCustomerPage(WebDriver driver)
  {
	  this.driver=driver;
	  PageFactory.initElements(driver,this);
  }
  public void Entercustomername()
  {
	  js=(JavascriptExecutor)driver;
	  wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	  wait.until(ExpectedConditions.visibilityOf(customernametextfield));
	  js.executeScript("arguments[0].click()",customernametextfield);
	  customernametextfield.sendKeys("Qsp");
	  
  }
  public void Entercustomerdescription()
  {
	  js=(JavascriptExecutor)driver;
	  wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	  wait.until(ExpectedConditions.visibilityOf(customerdescriptionfield));
	  js.executeScript("arguments[0].click()",customerdescriptionfield);
  }
  public void createcustomer()
  {
	  js=(JavascriptExecutor)driver;
	  wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	  wait.until(ExpectedConditions.visibilityOf(createcustomerbutton));
	  js.executeScript("arguments[0].click()",createcustomerbutton);
  }
}
