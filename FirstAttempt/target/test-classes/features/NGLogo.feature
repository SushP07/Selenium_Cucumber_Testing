Feature: NG LOGO

  Scenario: Display National Grid Logo on Home Page
    Given I launch Chrome Browser
    When I open National Grid Home Page
    Then I verify that the logo is on Page
    And Close Browser

