# Feature: Managers should be able to login to access their homepages
#     Scenario: As a manager I want to sign in so I can view my custom homepage.

#         Given the employee is on the login page
#         When the manager enters his correct username
#         When the manager enters his correct password 
#         When the employee clicks the login button
#         Then the manager should be logged into the manager homepage


Feature: Managers should be able to create defects to start addressing them
    Scenario:  As a manager I want to create defects so that I can start addressing them

        Given the manager is on custom view homepage
        When the manager gives name to the defect
        When the manager assigns tester to defect
        When the manager clicks the assign button
        Then the manager should receive an alert stating that defect has been created