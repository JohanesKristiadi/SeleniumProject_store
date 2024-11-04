Feature: Login feature

Scenario: login with valid username

Given I open website "https://www.saucedemo.com/"
And I input username "standard_user"
And I input password "secret_sauce"
And I click button login