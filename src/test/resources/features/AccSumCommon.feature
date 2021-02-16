Feature: Account Summary Page Practice
  Background:
    Given the user is logged in
    Then the "Account Summary" page should be displayed

  Scenario: Account Summary

    When the user should search "personal credits"
    Then the user should get "No results were found for the query: personal credit" message
    And the user should click HOME button and go directly to home page without logout
