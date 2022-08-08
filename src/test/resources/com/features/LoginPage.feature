Feature: Login page feature

Scenario: Check login page title
Given user is on login page
When user gets the title of the page
Then page title should be "Login - My Store"

Scenario: Forgot password Link
Given user is on login page
Then forgot password link should be displayed

Scenario: Login with correct credentials
Given user is on login page
When user enters username "abcd123@yopmail.com"
When user enters password "abcd123"
When user clicks on login button
Then user gets the title of the page
And page title should be "My account - My Store"
