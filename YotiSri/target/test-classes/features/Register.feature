@register
Feature: New customer Registeration


Scenario: Verify the new register customer

Given I am in Homepage
When I click on SignIn link
And I should see Register page
And I enter E-mail id and continue as guest
And I enter the Details
|Password|Test123@|
|DOB|21/11/1988|
|Address|40|
|City|Juneau|
|Postcode|99801|
|MobilePhone|123456789|

Then I should see user registered 
