@login
Feature: Login with newely created user

Scenario: Verify the login with newely created customer

Given I am in Homepage
When I click on SignIn link
And I should see the loginpage
And I enter the login details
|Email address|hari@test.com|
|Password|Test123@|
Then I click on login button


Scenario: Verify the login with Invaild Details

Given I am in Homepage
When I click on SignIn link
And I enter Invalid Details
|Email address|ahjgSHJHV@gmail.com|
|Password|62894hejdh|
And I click on login button
Then I should see error message
