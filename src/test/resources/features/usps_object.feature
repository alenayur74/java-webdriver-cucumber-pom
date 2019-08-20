@usps_object
  Feature: Usps Test Suite

    @usps_object1
    Scenario: Usps Stamps
      Given I go to "usps" page oop
      When I go to "stamps" oop
      And I sort by "Price (Low-High)" oop
      Then I verify that "Tiffany Lamp" is cheapest oop

