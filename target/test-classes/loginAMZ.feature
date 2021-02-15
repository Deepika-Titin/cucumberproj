
Feature: To validate the login functionality

Scenario: To check for the product
Given user has to launch chrome and hit the Amazon url
When user has to enter the keyword in searchbox
|product|
|Groot|
|Deepika|
|Udesh|
|Shanmu|

And click the search button
Then user unable to enter the home page



