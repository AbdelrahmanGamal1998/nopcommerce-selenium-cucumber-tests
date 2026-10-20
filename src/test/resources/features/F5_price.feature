@smoke
Feature:user can change between currencies US-Euro

  Scenario: user select price type
    Given user select "Euro" from currency type menu
    Then currency type is selected and displayed