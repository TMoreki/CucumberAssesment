@CreateGroup @Regression
Feature: Create Group and validate on Sign-Up

  Scenario: As an admin I want to create a group and validate it exists on the sign-up page
    Given i am on the login page
    And I enter email admin@gmail.com
    And I enter password @12345678
    When I click login button
    Then i should be logged in successfully
    And I click on user menu
    And I click on admin panel
    And I click on groups
    And I click on create group button
