Feature: OrangeHRM Login
  Scenario logo presence OrangeHRM home page
    Given I launch chrome browser
    When I open orange hrm homepage
    Then I verify that the logo is present
    And close browser
