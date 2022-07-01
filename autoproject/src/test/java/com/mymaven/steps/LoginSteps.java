package com.mymaven.steps;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.mymaven.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    
    @Given("the employee is on the login page")
public void the_employee_is_on_the_login_page() {     
    TestRunner.driver.get("File://C:/Users/colem/OneDrive/Desktop/VS CODE/MyMavenAutoProject/Foundations-Project/autoproject/src/test/resources/web pages/login-page.html");  
}

    @When("the employee clicks the login button")
public void the_employee_clicks_the_login_button() {  
    
    TestRunner.login.clickButton();    
}  

    @When("the manager enters his correct username")      
public void the_manager_enters_his_correct_username() 
{
    
    TestRunner.login.enterUsername("ManChug123");   
}

    @When("the manager enters his correct password")      
public void the_manager_enters_his_correct_password() 
{
    TestRunner.login.enterPassword("overcomer4");    
}
    @Then("the manager should be logged into the manager homepage")
public void the_manager_should_be_logged_into_the_manager_homepage() {

    TestRunner.wait.until(ExpectedConditions.titleIs("Manager Page"));
    String title = TestRunner.driver.getTitle();
    Assert.assertEquals("Manager Page", title);   
}

    @When("the tester enters his correct username")       
public void the_tester_enters_his_correct_username() {    // Write code here that turns the phrase above into concrete actions
    TestRunner.login.enterUsername("Byrd00");    
}

    @When("the tester enters his correct password")       
public void the_tester_enters_his_correct_password() {    // Write code here that turns the phrase above into concrete actions
    TestRunner.login.enterPassword("showout0");   
}

    @Then("the tester should be logged into the tester homepage")
public void the_tester_should_be_logged_into_the_tester_homepage() {
    TestRunner.wait.until(ExpectedConditions.titleIs("Tester Page"));
    String title = TestRunner.driver.getTitle();
    Assert.assertEquals("Tester Page", title);    
}

    
}
