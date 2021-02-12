Feature: Viewing products by filtering price
Scenario: user view aslist
Given open Desktop man
When user wants to view products as list
Then he System shows products as list

Scenario: user view asgrid
Given open Desktop man
When user wants to view products as grid
Then  the System shows products as grid
