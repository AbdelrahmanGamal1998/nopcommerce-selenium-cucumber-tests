@smoke
Feature: user will regeter to the registraion page to our website

  Scenario: user will try to register with right data

    Given user will go to the registration page
    # user chooses gender
    When user chooses male from sex selection bar
    # user enters firstname
    And user enters his/her FirstName"abdelrahman"
    # user enters his/her lastname
    And user enters his/her LastName"gamal"
    # user enters date of birth
    And user enters his/her Date of Birth "10" , "July" , "1998"
    # user enters email
    And user enters his/her Email account "body@example.com"
    # user enters company name
    And user enters his/her Company Name "BMW Company"
    # user enters password
    And user enters his/her Password for his account "P@AAAAssw0rd"
    # user enters confirm password
    And user enters Confirm Password "P@AAAAssw0rd"
    # user clicks on register button
    And user will click on registertion button at the end of page
    Then user is registered on system
