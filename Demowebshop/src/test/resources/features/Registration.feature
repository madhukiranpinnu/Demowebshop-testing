Feature: Registering new user 
Scenario: Register users
Given the user is in registration page
When the user wants to register using his valid credentials
Then the user register account successfully
Scenario: Register users
Given the user is in registration page
When the user wants to register using his invlaid credentials
Then the system shows error
Scenario: Register users
Given the user is in registration page
When the user wants to register using his empty credentials
Then the system shows error here