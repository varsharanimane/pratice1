
#Sample Feature Definition Template
@tag
Feature: datadriven testing for facebook
   @tag2
  Scenario Outline: Title of your scenario outline
    Given User enter the chrome browser and navigate the facebook page
    When User enter "<email_address>","<password>"
    When User is click on log in
    Then Invalid user name is diplyed

    Examples: 
      |email_address  |password | 
      | name15        | success |
      | name27        | Fail    |
