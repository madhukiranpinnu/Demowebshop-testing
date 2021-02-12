Feature: Forgot Password
Scenario: User Forgotpassword with valid email
Given the user is in Loginpage
When the user enter valid email id
Then the System displays email with instructions sent to you



Scenario: User Forgotpassword with invalid email
Given the user is in Loginpage
When the user enter invalid email id
Then the system throws an error message


Scenario: User Forgotpassword with empty email
Given the user is in Loginpage
When the user enter empty email id
Then the system displays enter valid email address
