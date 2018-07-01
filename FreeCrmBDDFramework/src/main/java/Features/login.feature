Feature: Free CRM Login feature

Scenario: Free CRM Login Test Scenario

Given user is already on the login page
When title of the login page is Free CRM
Then user enters username and password
Then user clicks on login button
And user is on home page
 

Scenario: user is able to create a new contact
Given user is already on the home page
When user mouse over on contacts link 
Then user clicks on New Contact link
Then user enters firstname and lastname
Then user clicks on save button
Then verify new contact created


Scenario Outline: Free CRM Login Test Scenario

Given user is already on the login page
When title of the login page is Free CRM
Then user enters "<username>" and "<password>"
Then user clicks on login button
And user is on home page

Examples:
	| username | password |
	| naveenk  | test@123 |
	
	
	  