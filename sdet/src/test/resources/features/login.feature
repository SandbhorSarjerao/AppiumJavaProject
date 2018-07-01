Feature: User should be able to validate iConnect page

Scenario Outline: User should be able to successfully login to iConnect
  Given user is on the iConnect login page 
  When user enters the login credentials user name <user-name> and password <password>
  Then user should be able to successfully login to iConnect page
  Examples:
  |user-name| password|
  | shirudka | 841762|