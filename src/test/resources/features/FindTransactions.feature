
Feature:Find Transactions inAccount Activity

  Background:
    Given the user accesses the "Find Transactions" tab

  Scenario: Search date range

    When the user enters date range from "2012-09-01" to "2012-09-06"
    And clicks search
    Then results table should only show transactions dates between "2012-09-01" to "2012-09-06"
  #  Then the results should be sorted by most recent date
 #   When the user enters date range from "2012-09-02" to "2012-09-06"
  #  And clicks search
  #  Then results table should only show transactions dates between "2010-09-02" to "2012-09-06"
  #  And the results table should only not contain transactions dated a









