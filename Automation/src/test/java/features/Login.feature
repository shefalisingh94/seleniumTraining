Feature: Application login

Scenario: Home Page default login
Given User is on Net Banking login page
When User login to the application with username and password
Then User is landing on Home Page
And All cards are displayed

