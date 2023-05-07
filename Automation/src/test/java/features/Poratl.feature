Feature: Portal login

Background:
Given validate the browser
When browser is triggered
Then check if browser is started

@Portaltest
Scenario: Home Page default login
Given User is on Net Banking login page
When User login to the application with "shefali" and "123"
Then User is landing on Home Page
And All cards are displayed "true"

@Portaltest
Scenario: Home Page default login
Given User is on Net Banking login page
When User login to the application with "john" and "4321"
Then User is landing on Home Page
And All cards are displayed "false"

@Portaltest
Scenario: Home Page default login
Given User is on Net Banking login page
When User signup with following details
|shefali |Singh |shefali123@gmail.com | 8800323211|
Then User is landing on Home Page
And All cards are displayed "false"

@Portaltest
Scenario Outline: Home Page default login
Given User is on Net Banking login page
When User login to application with <Username> and <Password>
Then User is landing on Home Page
And All cards are displayed "false"
Examples:
|Username |Password |
|user1    |pass1    |
|user2    |pass2    |
|user3    |pass3    |
|user4    |pass4    |