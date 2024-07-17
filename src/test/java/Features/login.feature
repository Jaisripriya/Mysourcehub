Feature: Book cart application demo

  Background:  
    Given User should navigate to the application login 
    And User should click the login link

@reg
  Scenario: Login should be success
    And User enter the username as "ortoni"
    And User enter the password as "pass1234"
    When User click the login button
    Then Login shold be sccessfull
    

@smoke @reg
  Scenario: Login should fail
    And User enter the username as "abc"
    And User enter the password as "Pass"
    When User click the login button
    But Login should be fail
