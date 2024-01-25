@prod
Feature: Login Feature
  In order to perform sucessful login
  As a user
  I have to enter correct username and password

  Scenario Outline: Login to Facebook WebSite
    Given user navigates to the facebook website
    When user validates the homepage title
    Then user entered "<username>" username
    And user entered "<password>" password
    And user clicks on the signin button

    Examples: 
      | username | password |
      | valid    | invalid  |
      | invalid  | valid    |
