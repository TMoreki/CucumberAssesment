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
    And I enter group name Automation Group
    And I enter group description This is for Ndosi BDD Assessment 2026
    And I select group year 2026
    And I enter max capacity 30
    And I enter start date 2026-01-01
    And I enter end date 2026-12-31
    And I click submit create group
    And I click back to website
    And I logout
    And I navigate to sign up page
    And I enter first name Lesego
    And I enter last name Moreki
    And I enter registration email newuser@gmail.com
    And I enter registration password @12345678
    And I enter confirm password @12345678
    Then the created group should exist in the group dropdown
