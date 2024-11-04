Feature: Login feature

Scenario: login with valid username

Given I open website "https://www.saucedemo.com/"
And I input username "standard_user"
And I input password "secret_sauce"
And I click button login

And I click Shopping cart
And I click checkout button
And I input firstname "john"
And I input lastname "doe"
And I input zipcode "155443"
And I click continue button
And I click button finish