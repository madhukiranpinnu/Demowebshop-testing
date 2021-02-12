Feature: Changepassword
Scenario: user enters same password
Given open application changepassword
When samepassword
Then close browsers

Scenario: user logs in with invalid credentials
Given open application changepassword
When diffrentpassword
Then tclose browser

