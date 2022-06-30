package com.mymaven.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateDefect {
  public static final String Alert = null;

private WebDriver driver;  
  
  @FindBy(id="assignTo")
  public WebElement assignToInput;

  @FindBy(id="desc")
  public WebElement descInput;

  @FindBy(tagName ="button" )
  public WebElement assignButton;

//   @FindBy(linkText = "alert")
//   public WebElement alertInput;



  public CreateDefect(WebDriver driver){
    this.driver = driver;
    PageFactory.initElements(driver,this);
  }

  public void enterAssignTo(String assignTo){
    this.assignToInput.sendKeys(assignTo);
  }

  public void enterDesc(String desc){
    this.descInput.sendKeys(desc);
  }

  public void clickButton(){
    this.assignButton.click();
  }
 
  

}
