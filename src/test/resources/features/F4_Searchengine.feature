@smoke
Feature: logged users could search for any product

  Scenario Outline: user could search using product name
    Given user search by name "<product name>"
    When user press on search
    Then user checks results
    Examples:
      | product name |
      | book         |
      | apple       |
      | cell       |



  Scenario Outline: user search by id
    Given user search by id"<serial number>"
    When user press on search
    Then user checks results
    Examples:
      | serial number |
      | FR_451_RB     |
      | FIRST_PRP     |
      | PRIDE_PRJ     |