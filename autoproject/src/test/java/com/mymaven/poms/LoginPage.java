package com.mymaven.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
 
    private WebDriver driver;

    @FindBy(id= "username")
    public WebElement usernameInput;
    @FindBy(id= "password")
    public WebElement passwordInput;
    @FindBy(tagName ="button")
    public WebElement loginButton;

   public LoginPage(WebDriver driver){
    this.driver = driver;
    PageFactory.initElements(driver, this);
   }

   public void enterUsername(String username){
        this.usernameInput.sendKeys(username);
   }

   public void enterPassword(String password){
    this.passwordInput.sendKeys(password);

   }

   public void clickButton(){
    this.loginButton.click();
   }
    
}
