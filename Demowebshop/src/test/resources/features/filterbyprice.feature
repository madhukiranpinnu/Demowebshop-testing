Feature: Viewing products by filtering price
Scenario: user selects under 1000
Given open Desktop
When user wants to view products under 1000
Then he System shows products below 1000 of demowebshop

Scenario: user selects between 1000 to 1200
Given open Desktop
When user wants to view products between 1000 to 1200
Then  the System shows products between 1000 to 1200 of demowebshop

Scenario: user selects above 1200
Given open Desktop
When user wants to view Recent products  above 1200
Then  the System shows  products above 1200of demowebshop