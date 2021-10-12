@Feature2
Feature: To validate the amazon login functionality

  Background: 
    Given To launch chrome browser and hit the amazon url

	@Regression @Smoke
  Scenario: To validate the valid username and invalid password
    When To pass the value in email or phno field
    And To click the continue button
    And To pass the values to password field
    And To click the signin button

	@Sanity
  Scenario: To Validate valid username and valid password
    When pass valid username in email field
    And click continue button
    And pass valid password in password field
    And click signin button
