Feature: Account login

@SmokeTest
Scenario: Home Page default login
Given User is on Net Banking login page
When User signup with following details
|shefali |Singh |shefali123@gmail.com | 8800323211|
Then User is landing on Home Page
And All cards are displayed "false"

