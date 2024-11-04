@tag
Feature: Logout from website

  Scenario: Log out
  
  Given I open website "https://www.saucedemo.com/"
	And I input username "standard_user"
	And I input password "secret_sauce"
	And I click button login
	
	And I click sidebar
	And I click logout button
