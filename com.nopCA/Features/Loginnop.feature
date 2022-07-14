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
#@LoginNOP
Feature: Test Login 
 

 # @loginadmin
  Scenario: Test the Loing function
    Given User are open the browser "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And Enetr the username "<email>" and password "<password>"
    When User should be click login button
    And User should be enter Dashbord
    Then User should be Logout
   
Examples:

|email|password|
|admin@yourstore.com|admin|
   

 