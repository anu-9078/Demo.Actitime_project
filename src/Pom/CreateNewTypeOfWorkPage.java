package Pom;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateNewTypeOfWorkPage
{
  public WebDriver driver;
  JavascriptExecutor js;
  WebDriverWait wait;
  
  @FindBy(xpath="//input[@id='name']")
  private WebElement nametextfield;
  
  @FindBy(xpath="//input[@value='   Create Type of Work   ']")
  private WebElement createtypeofworkbutton;
  
  public CreateNewTypeOfWorkPage(WebDriver driver)
  {
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
  public void name()
  {
	  js=(JavascriptExecutor)driver;
	  wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	  wait.until(ExpectedConditions.visibilityOf( nametextfield));
	  js.executeScript("arguments[0].click()", nametextfield);
	  nametextfield.sendKeys("Qspiser");
  }
  public void createtypework()
  {
	  js=(JavascriptExecutor)driver;
	  wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	  wait.until(ExpectedConditions.visibilityOf(createtypeofworkbutton));
	  js.executeScript("arguments[0].click()", createtypeofworkbutton);
  }
}
