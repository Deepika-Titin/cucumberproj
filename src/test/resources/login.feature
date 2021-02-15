@End_To_End_Testing
Feature: To validate the login functionality

Background: 

Given user has to launch chrome and hit the FB url

Scenario: To verify login functionality with valid username and Invalid password
When user has to enter the username and password
|username|password|
|Groot|12345|
|Deepika|12345|
|Udesh|12345|
|Shanmu|12345|

And click the login button
Then user unable to enter the home page

Scenario: To verify the Forgot password 

When user has to click the forgtton password link
And user has to enter credentials
And user has to click the search button
Then user has to be redirected to the OTP page




