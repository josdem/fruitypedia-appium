Feature: Category to recipe user flow
  Scenario: User is able to see a recipe based on category
    Given A categories view
    When I click in the first category
      And I validate list beverages
      And I click on the first beverage
    Then I validate recipe view