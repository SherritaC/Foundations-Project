package com.mymaven.poms;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.mymaven.runner.TestRunner;



public class UpdateDefect {

    private WebDriver driver; //will only be used internally so it is private

    @FindBy(id = "defectId")
    public WebElement defectIdSelect;
    @FindBy(id = "desc")
    public WebElement descSelect;
    @FindBy(id ="Accept")
    public WebElement acceptSelect;
    @FindBy(id = "butn1")
    public WebElement updateButn1;
    @FindBy(id = "butn2")
    public WebElement saveButn2;
    @FindBy(id = "status")
    public WebElement fixedSelect;
    @FindBy(id = "status")
    public WebElement shelvedSelect;
    @FindBy(id = "status")
    public WebElement rejectedSelect;
    @FindBy(id = "Accept")
    public WebElement declineSelect;
    // @FindBy(tagName = "")
    // public WebElement alertInput;

    public UpdateDefect(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void selectDefectId(){
        Select defectIdSelect = new Select(driver.findElement(By.id("defectId")));
        defectIdSelect.selectByIndex(0);
    }
    public void selectDesc(){
        Select descSelect = new Select(driver.findElement(By.id("desc")));
        descSelect.selectByIndex(0);
    }
    public void selectAccept(){
        Select acceptSelect = new Select(driver.findElement(By.id("Accept")));
        acceptSelect.selectByVisibleText("Accepted");
    }

    public void selectDecline(){
        Select declineSelect = new Select(driver.findElement(By.id("Accept")));
        declineSelect.selectByVisibleText("Declined");
    }
    public void  fixedStatus(){
        Select fixedSelect = new Select(driver.findElement(By.id("status")));
        fixedSelect.selectByVisibleText("Fixed");
    }
    public void  shelvedStatus(){
        Select shelvedSelect = new Select(driver.findElement(By.id("status")));
        shelvedSelect.selectByVisibleText("Shelved");
    }
    public void  rejectedStatus(){
        Select rejectedSelect = new Select(driver.findElement(By.id("status")));
        rejectedSelect.selectByVisibleText("Rejected");
    }
    public void enterAlert(){
        Alert alert = this.driver.switchTo().alert();
            String Text = alert.getText();
            Assert.assertEquals("defect updated", Text);
            TestRunner.driver.switchTo().alert().accept();

    }
    public void clickbutn1(){
        this.updateButn1.click();
    }
    public void clickbutn2(){
        this.saveButn2.click();

    }

    

    
  
    
}
