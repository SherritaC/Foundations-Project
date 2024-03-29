Feature: User of my bug catcher application should be able to login to their respective homepage
    Scenario: As a manager I want to sign in so I can view my custom homepage.

        Given the employee is on the login page
        When the manager enters his correct username
        When the manager enters his correct password 
        When the employee clicks the login button
        Then the manager should be logged into the manager homepage


    Scenario: As a tester I want to sign in so that I can view my custom homepage.

        Given the employee is on the login page
        When the tester enters his correct username
        When the tester enters his correct password 
        When the employee clicks the login button
        Then the tester should be logged into the tester homepage