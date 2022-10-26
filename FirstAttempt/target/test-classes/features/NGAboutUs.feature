Feature: NG Information

  Scenario: Display National Grid information after clicking on Power-Cut_Information
    Given I launch Chrome Browser
    When I open National Grid Home Page
    And I navigate to url "https://www.nationalgrid.co.uk/power-cut-information"
    Then I should get page title as "Power cut information"
    And I navigate back to National Grid Home Page
    And Close Browser