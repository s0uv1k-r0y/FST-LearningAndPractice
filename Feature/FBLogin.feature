Feature: FB Login


  Scenario: Login in FB
    Given User is on Login page
    When User enters email "user@gmail.com" and password "password"
    Then User Enters text