Feature: Free CRM Login feature

Scenario: Free CRM Login Test Scenario

Given user is already on the login page
When title of the login page is Free CRM
Then user enters username and password
Then user clicks on login button
And user is on home page
 




Scenario Outline: Free CRM Login Test Scenario

Given user is already on the login page
When title of the login page is Free CRM
Then user enters "<username>" and "<password>"
Then user clicks on login button
And user is on home page

Examples:
	| username | password |
	| naveenk  | test@123 |
	
	
	  