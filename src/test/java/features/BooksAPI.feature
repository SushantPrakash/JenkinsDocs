@books
Feature: Different types of methods for Bible Book API

  Scenario Outline: Getting bible books
    Given I create url to get books
    When I perform get request for "<URL>"
    Then I validate list of books
  Examples:
    |URL          |
#    |All Books    |
    |Specific Book|

#  Scenario: Create New User
#    Given I build url to create new user
#    When I perform post request
#    Then I validate user is created