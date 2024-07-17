Feature: Bookcart Application Demo

  Background: 
    Given User should navigate to the application

  Scenario Outline: Add a book to the cart
    And user should login as "<username>" and "<password>"
    And user search a "<book>"
    When user add a book to the cart
    Then the cart badge should be updated

    Examples: 
      | username | password | book            |
      | ortoni   | pass1234 | The Hookup      |
      | ortonikc | pass1234 | The Simple Wild |
