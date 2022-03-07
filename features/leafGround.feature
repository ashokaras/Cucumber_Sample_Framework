Feature: Leaf ground features
  Scenario: Edit functionality
    Given i launch app
    When i enter edit page
    Then i validate edit
    And i close browser

  Scenario: Button functionality
    Given i launch app
    When i enter button page
    Then i validate button
    And i close browser

  Scenario: Hyperlink functionality
    Given i launch app
    When i enter hyperlink page
    Then i validate hyperlink
    And i close browser

  Scenario: Image functionality
    Given i launch app
    When i enter image page
    Then i validate image
    And i close browser