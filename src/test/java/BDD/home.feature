@LoginE2E
Feature: end to end

  @test
  Scenario: Guest want login via email
    Given User open home page
    And User login with "testinguser@mailinator.com" password "admin123"
    And User search product "Minyak Goreng Rose Brand 2 L Karton"
    And User Choose product
    And User select quantity 2
    And User go to checkout page
    And User checkout
    And user choose payment method

    Then user success test