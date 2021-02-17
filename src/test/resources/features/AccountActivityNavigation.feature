
Feature: Navigating to specific accounts in Accounts Activity
  Background:
    Given the user is logged in
    Then the "Account Activity" page should be displayed

  Scenario: Savings account redirect

    When the user clicks on Savings link on the Account Summary page

    And Account drop down should have been "Savings" selected

  Scenario:	Brokerage	account	redirect

    When the user clicks on	Brokerage link on the Account Summary page

    And Account drop down should have been "Brokerage" selected

  Scenario:	Checking account redirect

    When the user clicks on	Checking link on the Account Summary page

    And Account drop down should have been "Checking" selected

  Scenario:	Credit Card account redirect

    When the user clicks on	Credit Card link on the Account Summary page

    And Account drop down should have been "Credit Card" selected

  Scenario:	Loan account redirect

    When the user clicks on	Loan link on the Account Summary page

    And Account drop down should have been "Loan" selected




