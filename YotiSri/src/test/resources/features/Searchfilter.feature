@Search
Feature: Search and Add a product 

Scenario: Add product Into Basket from search 

Given I am in HomePage
When I enter product into search "CASUAL DRESSES"
And I select product from search result page
And I should see product descrption page
And I add product into Basket
Then I click on proceed to checkout


Scenario Outline: Search Functionality

Given I am in HomePage
When I enter multiple product from search "<searchterm>" 
And I select product from search result page
And I should see product descrption page
And I add product into Basket
Then I click on proceed to checkout

Examples:
|searchterm|
|CASUAL DRESSES|
|EVENING DRESSES|
|SUMMER DRESSES|

Scenario: Add multiple products Into basket from search

Given I am in HomePage
When I add 1 product to basket from search 
|product1|dresses|
|product2|summer|
