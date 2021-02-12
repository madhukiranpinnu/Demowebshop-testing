Feature: Search
Scenario: search valid 
Given open applicationdemo
When user search vailid
Then he can see products

Scenario: search invalid
Given open applicationdemo
When user search invalid
Then the system shows errors

Scenario:search word
Given open applicationdemo
When user search singleword
Then the system doesnt show anything
