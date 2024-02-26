Feature: Category to recipe user flow
  Scenario: User is able to see a recipe based on category
    When I launch the application
    And I validate categories are visible
    And I should be able to click in the category
    And I should be able to list beverages
    And I should be able to click in a beverage
    And I should be able to view a recipe
    And I should back to beverage section
    Then I should back to category section