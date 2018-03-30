
Feature:Test Add Item To Trolley feature

   @Automated
  Scenario: Search the product and add the first product to the trolly
    Given I search for the "toys"
    And   I select a product "Chad Valley Ladybird Activity Toy"
    And   I add product to the trolley
    And   I go to the trolley
    Then  I should see "Chad Valley Ladybird Activity Toy" in the trolley

     Scenario:  Navigate to product description page