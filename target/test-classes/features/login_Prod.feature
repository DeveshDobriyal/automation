@bvt
Feature: Login Feature - Production
  In order to perform sucessful login
  As a user
  I have to enter correct username and password

  Scenario Outline: Login to Facebook WebSite as a user on production
    Given user navigates to the facebook website
    When user validates the homepage title
    Then user entered "<username>" username
    And user entered "<password>" password
    And user clicks on the signin button
    And Validates the home screen

    Examples: 
      | username | password |
      | valid    | invalid  |
      | invalid  | valid    |
