@smoke
Feature: user can add products to wishlist
  Scenario: logged in user adds products to the wishlist


    Given user go to login form our website

    When user enters right information "body@example.com" and "P@AAAAssw0rd"
    And user press on login button
    Then user logins successfully completed


    When user like product
    Then product added


    When user like product
    Then product added
    When product added message
    And user clicks on wishlist tab
    Then user checks wishlist
