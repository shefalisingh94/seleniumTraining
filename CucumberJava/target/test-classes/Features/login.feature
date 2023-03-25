
#LoginPage

Feature: feature to test login functionality
Scenario: Check login is successfull with valid credentials
    Given user is on Login Page
    When user enters username and password
    And clicks on Login button
    Then user should nevigate to the Hoempage

 