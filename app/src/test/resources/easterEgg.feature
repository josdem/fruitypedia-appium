@Regression
Feature: Fruitypedia run a easter egg feature
  Scenario: User is able to click five times in toolbar
    Given A categories view
    When I click on toolbar "5" times
    Then I validate I can see a hello message