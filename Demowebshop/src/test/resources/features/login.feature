Feature: login to application
Scenario: user logs in
Given open application
When user wants to login
Then he can login to the application

Scenario: user logs in with invalid credentials
Given open application
When user enters invalid credentials
Then the system to throw an error message

Scenario: user logs in with empty cells
Given open application
When user didnot enter any credentials
Then the system to throw an error message
