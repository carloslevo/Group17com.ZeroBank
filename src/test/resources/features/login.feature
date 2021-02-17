
  Feature: user Login
     Scenario: authorized users should be able to login
       Given user is on the login page
       When user enters valid credentials
       Then the user should be able to login


    Scenario: wrong credentials should get warning message
      Given user is on the login page
      When user enters invalid credentials
      Then user should get "Login and/or password are wrong." message


