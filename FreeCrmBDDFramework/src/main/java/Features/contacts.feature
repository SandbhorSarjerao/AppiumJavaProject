Feature: Free CRM Create Contacts

Scenario Outline: Freee CRM Create a new contact scenario

Given user is already on the home page
When title of the login page is Free CRM
Then user enters "<username>" and "<password>"
Then user clicks on login button
And user is on home page
When user mouse over on contacts link 
Then user clicks on New Contact link
Then user enters "<firstname>" and "<lastname>"
Then user clicks on save button
Then verify new contact created

Examples:
	| username | password | firstname | lastname |
	| naveenk  | test@123 | Tom       | Peter    |
	| naveenk  | test@123 | David     | Desouza  | 