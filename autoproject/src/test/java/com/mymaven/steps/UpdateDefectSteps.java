package com.mymaven.steps;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.mymaven.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class UpdateDefectSteps {

    @Given("the tester is on their homepage")
public void the_tester_is_on_their_homepage() {
    TestRunner.driver.get("File://C:/Users/colem/OneDrive/Desktop/VS CODE/MyMavenAutoProject/Foundations-Project/autoproject/src/test/resources/web pages/Tester-page.html");
}
    @When("the tester selects the defect name")
public void the_tester_selects_the_defect_name() {
    TestRunner.updateDefect.selectDesc();
}
    @When("the tester selects the accept button")
public void the_tester_selects_the_accept_button() {
    TestRunner.updateDefect.selectAccept();
}
    @When("the tester clicks on the update button")
public void the_tester_clicks_on_the_update_button() {
    TestRunner.updateDefect.clickbutn1();
}
    @Then("the tester should be able to accept the defect")
public void the_tester_should_be_able_to_accept_the_defect() {
   TestRunner.updateDefect.selectAccept();
}


    @When("the tester selects the decline button")
public void the_tester_selects_the_decline_button() {
    TestRunner.updateDefect.selectDecline();
}

    @Then("the tester should be able to decline the defect")
public void the_tester_should_be_able_to_decline_the_defect() {
    TestRunner.wait.until(ExpectedConditions.alertIsPresent());
    String text = TestRunner.driver.switchTo().alert().getText();
     Assert.assertEquals("defect updated", text);
     TestRunner.driver.switchTo().alert().accept();
}



    @When("the tester selects the fixed option")
public void the_tester_selects_the_fixed_option() {
   
    TestRunner.updateDefect.fixedStatus();
}
    @When("the tester clicks the save button")
public void the_tester_clicks_the_save_button() {
    TestRunner.updateDefect.clickbutn2();
    
}
 
    @Then("the tester should be able to save defect status as fixed")
public void the_tester_should_be_able_to_save_defect_status_as_fixed() {
   
    TestRunner.wait.until(ExpectedConditions.alertIsPresent());
    String text = TestRunner.driver.switchTo().alert().getText();
     Assert.assertEquals("defect updated", text);
     TestRunner.driver.switchTo().alert().accept();
    
     
}

 

    @When("the tester selects the rejected option")
public void the_tester_selects_the_reject_option() {
    TestRunner.updateDefect.rejectedStatus();
}

    @Then("the tester should be able to save defect status as rejected")
public void the_tester_should_be_able_to_save_defect_status_as_rejected() {

    TestRunner.wait.until(ExpectedConditions.alertIsPresent());
    String text = TestRunner.driver.switchTo().alert().getText();
     Assert.assertEquals("defect updated", text);
     TestRunner.driver.switchTo().alert().accept();

    //TestRunner.updateDefect.enterAlert();
}



    @When("the tester selects the shelved option")
public void the_tester_selects_the_shelved_option() {
    TestRunner.updateDefect.shelvedStatus();
}

    @Then("the tester should be able to save defect status as shelved")
public void the_tester_should_be_able_to_save_defect_status_to_shelved() {
    TestRunner.wait.until(ExpectedConditions.alertIsPresent());
    String text = TestRunner.driver.switchTo().alert().getText();
     Assert.assertEquals("defect updated", text);
     TestRunner.driver.switchTo().alert().accept();
  
}
}
