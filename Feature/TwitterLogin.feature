Feature: Twitter Login


  Scenario Outline: Login in Twitter
    Given User is on Twitter Login page
    When User logs in with <email> and <password>
    Then User Enters text and tries to login

    Examples:
      | email            | password |
      | abc@gmail.com    | abc      |
      | qwerty@gmail.com | qwerty   |
      | xyz@gmail.com    | xyz      |