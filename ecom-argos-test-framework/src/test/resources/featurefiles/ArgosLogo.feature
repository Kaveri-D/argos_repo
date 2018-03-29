Feature: Argos Homepage
  Scenario: Verify Argos Logo on top of left side
    Given I am on homepage
    When  I see left corner
    Then  I see "Argos" brand logo
