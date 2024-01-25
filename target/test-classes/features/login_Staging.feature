@staging
Feature: Login Feature - Production
  In order to perform sucessful login
  As a user
  I have to enter correct username and password

  Background: 
    Given user navigates to the facebook website
    When user validates the homepage title
@staging
  Scenario: Login to Facebook WebSite as a user on staging
    Then user entered "valid" username
    And user entered "valid" password
    And user clicks on the signin button
    And Validates the home screen

  Scenario: Login to Facebook WebSite as a user on staging
    Then user entered "invalid" username
    And user entered "invalid" password
    And user clicks on the signin button
    And Validates the home screen
