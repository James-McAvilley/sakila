#Feature: Display films on load
#  Scenario Outline: verify database loads
#    Given the application is running
#    When the "<page>" loads
#    And the api connects
#    Then display a list of films
#
#    Examples:
#    |page |
#    |Home |
#    |Actor|
#    |Film |

Feature: Load a film
  Scenario: verify film data loads
    Given I have an ID
    And The ID has a movie in the database
    When A request is made for the data
    Then Return the correct data


