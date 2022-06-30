Feature:  Tester should be able to initally update the defects so they can accept or decline the defect
    Scenario:  As a tester, I want to initally accept the defects so that I can continue working on it  

        Given the tester is on their homepage
        When the tester selects the defect name
        When the tester selects the accept button
	    When the tester clicks on the update button
        Then the tester should be able to accept the defect 

    Scenario:  As a tester, I want to initally decline the defects so that I can work on something else

        Given the tester is on their homepage
        When  the tester selects the defect name
        When the tester selects the decline button
        When the tester clicks on the update button
        Then the tester should be able to decline the defect 

# Feature: Tester should be able to save the defect status as fixed, rejected, or shelved  
    Scenario: As a tester, I want to fix the defects so that I can update the defect status to fixed

        Given the tester is on their homepage 
        When the tester selects the accept button
        When the tester clicks on the update button
        When the tester selects the fixed option
        When the tester clicks the save button
        Then the tester should be able to save defect status as fixed

 
    Scenario: As a tester, I want to shelved the defects so that I can update the status to shelved 

        Given the tester is on their homepage 
        When the tester selects the accept button
        When the tester clicks on the update button
        When the tester selects the shelved option
        When the tester clicks the save button
        Then the tester should be able to save defect status as shelved

 
    Scenario: As a tester, I want to reject the defect so that I can update the status to rejected

        Given the tester is on their homepage 
        When the tester selects the accept button
        When the tester clicks on the update button 
        When the tester selects the reject option
        When the tester clicks the save button
        Then the tester should be able to save defect status as rejected