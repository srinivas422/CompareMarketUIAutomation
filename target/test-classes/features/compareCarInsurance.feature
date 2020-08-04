#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#@ (Tags/Labels):To group Scenarios
#""
## (Comments)
@CarInsuranceCompare
Feature: Web :: User Car Insurance Comparison journey
  In order to collate the information required to get quotes from companies that provide the car insurance
  As a user
  I want a website which will allow me to search with different options to compare and find the best price for my car insurance

  Background: 
    Given I navigate to comparethemarket website
    And I wait for "3" seconds
    When  I click on car insurance button
    And I click on compare button

  @ComprehensiveCarInsuranceCompare
  Scenario Outline: User Car Insurance Comparison journey
    Then Website allows to enter Rego number of the car as "<regoNum>"
    And I select "<state>" after I click next button
    And I select insurance type as "<insuranceType>"
    And I select the "<accessoriesAnswer>" for the question related to  factory options and non standard accessories
    And I select the "<ModificationsAnswer>" for the question car modifications
    And I select the "<repairsAnswer>" for the question car accidental repairs
    And I select the "<financeAnswer>" for the question car finance
    And I select the private as an option for usage type
    And I select the "<insuredAnswer>" as an option for usage type
    And I enter the "<noOFKms>" per year to travel before clicking next button
    And I enter the "<postCode>" where the car usually park
    And I enter the "<address>" for the car usually park
    And I select the car parking type as carpark
    And I select the regular driver's gender as Male before entering the date of birth
    And I select the employment status before proceed further
    And I enter the age before clicking the next button
    And I select the options for claims in last 5 years, owning another car and young driver
    And I select the option as No Restrictions on the policy for drivers
    Then I enter the personal details before proceeding further
    And i select the default date and accept button for all terms and conditions before clicking the getQuotes button
    And I wait for "10" seconds
    Then I capture the displayed quote results from different companies
    And I close the browser

    Examples:
      | regoNum | state           | insuranceType | accessoriesAnswer | ModificationsAnswer | financeAnswer | repairsAnswer | insuredAnswer | noOFKms | postCode | address                                   |
      | CU91EW  | New South Wales | Comprehensive | No                | No                  | No            | No            | Yes           | 6000    | 2150     | 23 Campbell Street, Parramatta, NSW, 2150 |
