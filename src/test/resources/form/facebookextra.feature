#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
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