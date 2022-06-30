package com.mymaven.steps;


import com.mymaven.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class CreateDefectSteps {
   
  

    @Given("the manager is on custom view homepage")
public void the_manager_is_on_custom_view_homepage() {
    TestRunner.driver.get("File://C:/Users/colem/OneDrive/Desktop/VS CODE/MyMavenAutoProject/autoproject/src/test/resources/web pages/Manager-page.html");
}

@When("the manager assigns tester to defect")
public void the_manager_assigns_tester_to_defect() {
    TestRunner.createDefect.enterAssignTo("Trone44");
}

    @When("the manager gives name to the defect")
public void the_manager_gives_name_to_the_defect() {
  TestRunner.createDefect.enterDesc("bigTruck");
}


    @When("the manager clicks the assign button")
public void the_manager_clicks_the_assign_button() {

    TestRunner.createDefect.clickButton(); 
}

    @Then("the manager should receive an alert stating that defect has been created")
public void the_manager_should_receive_an_alert_stating_that_defect_has_been_created() {
   
}

}