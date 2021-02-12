Feature: Community poll
Scenario: user to vote in community poll
Given user in home page poll
When user selects radio button
Then the system displays number of votes gained


Scenario: user to vote in community poll
Given user in home page poll
When user didnot select any radio button
Then the system displays please select an answer


Scenario: user to vote in community poll
Given user in home page poll
When user selects radio button without login
Then the system displays only registered users can vote
