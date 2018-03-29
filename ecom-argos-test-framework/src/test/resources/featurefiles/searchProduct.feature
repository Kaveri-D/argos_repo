Feature: Search Functionality
  Scenario: Usesr search the product using brand name
    Given I am on home page
    When  I search for the product "nike"
    Then  I should see the the nike product list
