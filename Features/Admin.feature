Feature: Admin
  
  Scenario: Login with valid creadential
    Given User launch Chrome Browser
    When User open url "https://admin-democommerce.com/login"
    And User enter Email as "admin@yourstore.com" and password as "admin"
    And User click on login button
    Then close browser
    
    Scenario Outline: Login with valid creadential
    Given User launch Chrome Browser
    When User open url "https://admin-democommerce.com/login"
    And User enter Email as "<email>" and password as "<password>"
    And User click on login button
    Then close browser
    
    Examples:
    |email              |password |
    |admin@yourstore.com|admin    |
    |admin@yourstore.com|admin12  |