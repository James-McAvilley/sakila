Feature: Load an Actor
  Scenario: verify actor data loads
    Given Actor has an ID
    And The ID has a Actor in the database
    When A request is made for the actors data
    Then Return the correct actor data