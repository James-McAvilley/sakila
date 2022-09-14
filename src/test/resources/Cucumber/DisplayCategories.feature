Feature: Load an Category
  Scenario: verify Category data loads
    Given Category has an ID
    And The ID has a Category in the database
    When A request is made for the Category data
    Then Return the correct Category data