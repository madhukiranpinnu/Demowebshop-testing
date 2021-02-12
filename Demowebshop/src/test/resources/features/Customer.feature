Feature: CustomerService
Scenario: user selects News
Given open application main
When user wants to view News
Then he System shows News of demowebshop

Scenario: user selects Blog
Given open application main
When user wants to view Blog
Then  the System shows Blog of demowebshop

Scenario: user selects Recent products
Given open application main
When user wants to view Recent products
Then  the System shows Recent products of demowebshop

Scenario: user selets Compare products
Given open application main
When user wants to view Compare products
Then  the System shows compareproducts of demowebshop

Scenario: user selects NewProducts
Given open application main
When user wants to view Newproducts
Then the System shows Newproducts channel of demowebshop
