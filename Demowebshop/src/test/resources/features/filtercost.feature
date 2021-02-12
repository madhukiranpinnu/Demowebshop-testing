Feature: Viewing products by filtering cost
Scenario: user view as under 1000
Given open Desktop mansher
When user wants to view product under 1000
Then he System shows products as under 1000

Scenario: user view asgrid
Given open Desktop mansher
When user wants to view produt between 1000 and 1200
Then  the System shows products as under 1200
