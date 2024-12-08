@tag
Feature: Login functionality for OpenCart E-commerce website
  As a user of the OpenCart website
  I want to be able to log in with my account
  So that I can access my account-related features and manage my orders
  
  Background:
  	Given I am on the OpenCart login page

  @tag1
  Scenario: Successful login with valid credentials
    Given I have entered valid username and password
    When I click on login button
    Then I should be logged in successfully

  @tag2
  Scenario Outline: Unsuccessful login with invalid or empty credentials
    Given I have entered invalid "<username>" and "<password>"
    When I clicked on the login button
    Then I should see an error message indicating  "<error_message>"

    Examples: 
      | username  				| password 				| error_message 																				|
      | invalid@email.com | invalidPassword | Warning: No match for E-mail Address and/or Password. |
      | abcccc 						| validPassword 	|	Warning: No match for E-mail Address and/or Password. |
      | valid@email.com   | abcccc    			| Warning: No match for E-mail Address and/or Password. |

      
   Scenario: Navigating to the forgotten password page
     When I click on the "Forgotten Password" link
     Then I should be redirected to the password reset page