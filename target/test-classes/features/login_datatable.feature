@datatable
Feature: Login Feature - Production
  In order to perform sucessful login
  As a user
  I have to enter correct username and password

  Scenario Outline: Login to Facebook WebSite as a user on production
    Given user navigates to the facebook website
    When user validates the homepage title
    Then user entered "valid" username
    And user entered "valid" password
    And Validates the home screen
    And user enters firstname and lastname
      | Name | LName |
      | lax  | roe   |
      | tan  | joe   |
    And user clicks on the signin button
