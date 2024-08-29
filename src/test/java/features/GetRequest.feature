Feature: Various Get requests on Age of Empires 2
  Scenario: Gets a list of all the civilizations in AOE2
    Given I build request specification to get list of all the civilizations in AOE
    Then I expect status code of 200
    And List of all civilizations
