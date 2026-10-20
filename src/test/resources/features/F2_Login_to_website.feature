@smoke
Feature: user login to website

  Scenario: user login with right email and password right info
    Given user go to login form our website
    # user enter valid email and password
    When user enters right information "body@example.com" and "P@AAAAssw0rd"
    And user press on login button
    Then user logins successfully completed


  Scenario:user login with wrong info
    Given user go to login form our website
    # user enter invalid email and password
    When user enters wrong information "bogy@example.com" and "P@sAAAAssw0rd"
    And user press on login button
    Then user will not login to system failled login