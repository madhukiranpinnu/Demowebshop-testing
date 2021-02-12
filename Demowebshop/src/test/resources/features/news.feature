Feature: open applicationhere too
Scenario: user to subscribe for newsletter
Given open application newsletter
When user enters valid email id 
Then the system displays thank you for signing up 

Scenario: user to subscribe for newsletter
Given open application newsletter         
When user enters invalid email id 
Then the system displays enter valid email id